package com.fusco2k.jofoa;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Filipe on 19/09/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int mNumberOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumberOfTabs) {
        super(fm);

        this.Titles = mTitles;
        this.mNumberOfTabs = mNumberOfTabs;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {

            return new Day1ListFragment();
        }
        if(position == 1) // if the position is 0 we are returning the First tab
        {
            return new Day2ListFragment();
        }
        if(position == 2) // if the position is 0 we are returning the First tab
        {
            return new Day3ListFragment();
        }
        if(position == 3) // if the position is 0 we are returning the First tab
        {
            return new Day4ListFragment();
        }
        else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            return new Day5ListFragment();
        }


    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }
}
