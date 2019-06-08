package com.fusco2k.jofoa.courses;

import android.os.Bundle;
import android.view.LayoutInflater
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.fusco2k.jofoa.R

class Day5Fragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private val courseLab: CourseLab = CourseLab()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_day, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = DayAdapter(courseLab.friday)
    }
}