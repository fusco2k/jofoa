package com.cognus.jofoa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    static final String TAG = "JOFOA";

    private Toolbar mToolbar;

    private Button mScheduleButton;
    private Button mAboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate()");
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

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

}
