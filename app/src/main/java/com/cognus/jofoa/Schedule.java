package com.cognus.jofoa;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Schedule extends ActionBarActivity {

    AdView mAdView;

    private ViewPager pager;
    private TabsAdapter mTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_schedule);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("A1904DA8E18D7B2CC5A828B03F8C942C").build();
        mAdView.loadAd(adRequest);

        pager = (ViewPager) findViewById(R.id.pager);

        final android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(android.support.v7.app.ActionBar.NAVIGATION_MODE_TABS);

        mTabsAdapter = new TabsAdapter(this, pager);
        mTabsAdapter.addTab(bar.newTab().setText("Segunda-Feira"), Day1ListFragment.class, null);
        mTabsAdapter.addTab(bar.newTab().setText("Terça-Feira"), Day2ListFragment.class, null);
        mTabsAdapter.addTab(bar.newTab().setText("Quarta-Feira"), Day3ListFragment.class, null);
        mTabsAdapter.addTab(bar.newTab().setText("Quinta-Feira"), Day4ListFragment.class, null);
        mTabsAdapter.addTab(bar.newTab().setText("Sexta-Feira"), Day5ListFragment.class, null);
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();

    }

    /**
     * Called when returning to the activity
     */
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    /**
     * Called before the activity is destroyed
     */
    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }

}
