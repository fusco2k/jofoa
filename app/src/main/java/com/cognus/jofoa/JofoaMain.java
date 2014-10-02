package com.cognus.jofoa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class JofoaMain extends ActionBarActivity {

	private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

	InterstitialAd interstitial;
	AdView mAdView;

	private ViewPager pager;
	private TabsAdapter mTabsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		checkForGcm();

		setContentView(R.layout.activity_main);
		
		mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		pager = (ViewPager) findViewById(R.id.pager);

		final android.support.v7.app.ActionBar bar = getSupportActionBar();
		bar.setNavigationMode(android.support.v7.app.ActionBar.NAVIGATION_MODE_TABS);

		mTabsAdapter = new TabsAdapter(this, pager);
		mTabsAdapter.addTab(bar.newTab().setText("Segunda-Feira"),
				Day1ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Terça-Feira"),
				Day2ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Quarta-Feira"),
				Day3ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Quinta-Feira"),
				Day4ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Sexta-Feira"),
				Day5ListFragment.class, null);
		
		
		
	}

	private boolean checkForGcm() {
		int ret = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
		if (ConnectionResult.SUCCESS == ret) {
			return true;
		} else {
			if (GooglePlayServicesUtil.isUserRecoverableError(ret)) {
				GooglePlayServicesUtil.getErrorDialog(ret, this,
						PLAY_SERVICES_RESOLUTION_REQUEST).show();
			} else {
				Toast.makeText(this,
						"Google Message Not Supported on this device",
						Toast.LENGTH_LONG).show();
			}
			return false;
		}
	}

	@Override
	public void onPause() {
		if (mAdView != null) {
			mAdView.pause();
		}
		super.onPause();

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

	}

	/** Called when returning to the activity */
	@Override
	public void onResume() {
		super.onResume();
		if (mAdView != null) {
			mAdView.resume();
		}
	}

	/** Called before the activity is destroyed */
	@Override
	public void onDestroy() {
		if (mAdView != null) {
			mAdView.destroy();
		}
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Intent intent = new Intent(JofoaMain.this, Sobre.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}

}
