package com.cognus.jofoa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class About extends AppCompatActivity {

    TextView mSobre;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        mSobre = (TextView) findViewById(R.id.sobre);
        mSobre.setText("Contato: filipe.fusco@gmail.com\n\n" +
                "Versão: Beta-0.1");
    }

}
