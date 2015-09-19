package com.cognus.jofoa;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;

import java.io.IOException;
/**
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import java.net.URI;
import java.net.URISyntaxException;
 **/
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main extends AppCompatActivity {

    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
    private static final String GCM_SENDER_ID = "613297133076";
    //private static final int APP_ID = 01;
    public static final String PROPERTY_REG_ID = "registration_id";

    static final String TAG = "JOFOA";

    private Toolbar mToolbar;

    private Context context;
    private GoogleCloudMessaging gcm;
    private String registrationId;

    private Executor threadPool = Executors.newFixedThreadPool(1);

    private Button mScheduleButton;
    private Button mAboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate()");
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        context = getApplicationContext();
        if (checkForGcm()) {
            gcm = GoogleCloudMessaging.getInstance(this);
            registrationId = getRegistrationId(this);
            if (registrationId.isEmpty()) {
                threadPool.execute(new Runnable() {
                    public void run() {
                        final String regn = registerWithGcm();
                        Log.d(TAG, "New Registration = " + regn);
                    }
                });
            } else {
                final String mesg = "Previous Registration = " + registrationId;
                Log.d(TAG, mesg);
            }
        } else {
            Toast.makeText(getApplicationContext(), "Failed to check gcm", Toast.LENGTH_LONG).show();
        }

        mScheduleButton = (Button) findViewById(R.id.schedule_button);
        mScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this, Schedule.class);
                startActivity(intent);
            }
        });
        mAboutButton = (Button) findViewById(R.id.about_button);
        mAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main.this, About.class);
                startActivity(intent);
            }
        });

    }

    private String registerWithGcm() {
        String mesg;
        try {
            if (gcm == null) {
                gcm = GoogleCloudMessaging.getInstance(context);
            }
            registrationId = gcm.register(GCM_SENDER_ID);
            mesg = "Device registered! My registration = " + registrationId;

            //sendRegistrationIdToMyServer(registrationId);

            storeRegistrationId(context, registrationId);
        } catch (IOException ex) {
            mesg = "Error :" + ex.getMessage();
            // If there is an error, don't just keep trying to register.
            // Require the user to click a button again, or perform
            // exponential back-off.
            Toast.makeText(context, mesg, Toast.LENGTH_LONG).show();
            throw new RuntimeException(mesg);
        }
        return mesg;
    }

    /**
     * private void sendRegistrationIdToMyServer(String regid) {
     * URI url = null;
     * try {
     * url = new URI("http://177.83.210.61:8080/php/register.php?regId=" + regid + "&appId=" + APP_ID);
     * } catch (URISyntaxException e) {
     * e.printStackTrace();
     * }
     * HttpClient httpclient = new DefaultHttpClient();
     * HttpGet request = new HttpGet();
     * request.setURI(url);
     * Log.i(TAG, "Sent to server");
     * try {
     * httpclient.execute(request);
     * } catch (ClientProtocolException e) {
     * e.printStackTrace();
     * } catch (IOException e) {
     * e.printStackTrace();
     * }
     * }
     */
    private void storeRegistrationId(Context context, String regId) {
        final SharedPreferences prefs = getSharedPreferences(Main.class.getSimpleName(), Context.MODE_PRIVATE);
        Log.i(TAG, "Saving regId on app version " + regId);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(PROPERTY_REG_ID, regId);
        editor.apply();
    }

    private String getRegistrationId(Context context) {
        final SharedPreferences prefs = getSharedPreferences(Main.class.getSimpleName(), Context.MODE_PRIVATE);
        String registrationId = prefs.getString(PROPERTY_REG_ID, "");
        if (registrationId.isEmpty()) {
            Log.i(TAG, "Registration not found.");
            return "";
        }
        return registrationId;
    }

    private boolean checkForGcm() {
        int ret = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (ConnectionResult.SUCCESS == ret) {
            return true;
        } else {
            if (GooglePlayServicesUtil.isUserRecoverableError(ret)) {
                GooglePlayServicesUtil.getErrorDialog(ret, this, PLAY_SERVICES_RESOLUTION_REQUEST).show();
            } else {
                Toast.makeText(this, "Google Message Not Supported on this device", Toast.LENGTH_LONG).show();
            }
            return false;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkForGcm();
    }

}
