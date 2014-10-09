package com.cognus.jofoa;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity{
	
	TextView mSobre;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sobre);
		
		mSobre = (TextView) findViewById(R.id.sobre);		
		mSobre.setText("Contato: filipe.fusco@gmail.com\n\n" +
				"Versão: Beta-0.1");
	}

}
