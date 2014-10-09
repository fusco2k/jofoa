package com.cognus.jofoa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Schedule extends ActionBarActivity {

	AdView mAdView;

	private ViewPager pager;
	private TabsAdapter mTabsAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_schedule);
		
		mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		pager = (ViewPager) findViewById(R.id.pager);

		final android.support.v7.app.ActionBar bar = getSupportActionBar();
		bar.setNavigationMode(android.support.v7.app.ActionBar.NAVIGATION_MODE_TABS);

		mTabsAdapter = new TabsAdapter(this, pager);
		mTabsAdapter.addTab(bar.newTab().setText("Segunda-Feira"),Day1ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Terça-Feira"),Day2ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Quarta-Feira"),Day3ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Quinta-Feira"),Day4ListFragment.class, null);
		mTabsAdapter.addTab(bar.newTab().setText("Sexta-Feira"),Day5ListFragment.class, null);
	}

	@Override
	public void onPause() {
		if (mAdView != null) {
			mAdView.pause();
		}
		super.onPause();

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
			Intent intent = new Intent(Schedule.this, About.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}

}
