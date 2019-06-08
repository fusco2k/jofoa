package com.fusco2k.jofoa;

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.fusco2k.jofoa.courses.*

class TabAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    private val courseLab: CourseLab = CourseLab()

    override fun getCount(): Int = courseLab.event.size

    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> Day1Fragment()
            1 -> Day2Fragment()
            2 -> Day3Fragment()
            3 -> Day4Fragment()
            4 -> Day5Fragment()
            else -> Day1Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position){
            0 -> "Dia 1"
            1 -> "Dia 2"
            2 -> "Dia 3"
            3 -> "Dia 4"
            4 -> "Dia 5"
            else -> "Dia"
        }
    }
}
