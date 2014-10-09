package com.cognus.jofoa;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;

import static com.google.android.gms.gcm.GoogleCloudMessaging.MESSAGE_TYPE_DELETED;
import static com.google.android.gms.gcm.GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE;
import static com.google.android.gms.gcm.GoogleCloudMessaging.MESSAGE_TYPE_SEND_ERROR;

public class GcmService extends IntentService {

    final static String TAG = Main.TAG;

    public GcmService() {
        super(GcmService.class.getSimpleName());
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String messageType = GoogleCloudMessaging.getInstance(this).getMessageType(intent);
        Log.d(Main.TAG, "Got a message of type " + messageType);
        Bundle extras = intent.getExtras();

        if (messageType.equals(MESSAGE_TYPE_MESSAGE)) {
            // GOOD
            String message = extras.getString("message");
            generateNotification(this, message);
            Log.d(TAG, "MESSAGE = '" + message + "' (" + extras.toString() + ")");
        } else if (messageType.equals(MESSAGE_TYPE_SEND_ERROR)) {
            Log.e(TAG, "Error sending previous message ");
        } else if (messageType.equals(MESSAGE_TYPE_DELETED)) {
            Log.e(TAG, "Too many messages for you, server deleted some");
        }

        GcmReceiver.completeWakefulIntent(intent);
    }


    private static void generateNotification(Context context, String message) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.ic_launcher).
                setContentTitle("Title").setContentText(message);
        Intent resultIntent = new Intent(context, Main.class);
        PendingIntent resultPendingIntent = PendingIntent.getActivity(
                        context,
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =(NotificationManager) context.getSystemService(NOTIFICATION_SERVICE);
        mBuilder.setDefaults(Notification.DEFAULT_ALL);
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
    }
}



