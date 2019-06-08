package com.fusco2k.jofoa;

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter;

class TabAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val courseLab: CourseLab = CourseLab()

    override fun getCount(): Int = courseLab.event.size

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> Day1ListFragment()
            else -> Day1ListFragment()
        }
    }
}
