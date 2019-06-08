package com.fusco2k.jofoa.courses

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fusco2k.jofoa.R

class DayAdapter(private val list: List<Course>) : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.list_item_course, parent, false) as LinearLayout
        return ViewHolder(listItem)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val titleTextView = holder.linearLayout.findViewById<TextView>(R.id.course_list_item_titleTextView)
        titleTextView.text = list[position].courseName
        val professorTextView = holder.linearLayout.findViewById<TextView>(R.id.course_list_item_professorTextView)
        professorTextView.text = list[position].professorName
        val timeTextView = holder.linearLayout.findViewById<TextView>(R.id.course_list_item_timeTextView)
        timeTextView.text = list[position].eventTime
        val picture = holder.linearLayout.findViewById<ImageView>(R.id.foto)
        picture.setImageResource(list[position].pictureID)
    }
}

class ViewHolder(val linearLayout: LinearLayout) : RecyclerView.ViewHolder(linearLayout)