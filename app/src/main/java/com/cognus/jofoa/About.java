package com.cognus.jofoa;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class About extends ActionBarActivity {

    TextView mSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        mSobre = (TextView) findViewById(R.id.sobre);
        mSobre.setText("Contato: filipe.fusco@gmail.com\n\n" +
                "Versão: Beta-0.1");
    }

}
