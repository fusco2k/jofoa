package com.fusco2k.jofoa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class Day1ListFragment : Fragment() {
//    private var mCourses: ArrayList<Course>? = null


//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        mCourses = CourseLab.Companion.get(activity).getCourses()
//        val adapter = CourseAdapter(mCourses)
//        listAdapter = adapter
//    }
//
//    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
//        val (courseName) = listAdapter.getItem(position) as Course
//    }
//
//    private inner class CourseAdapter(courses: ArrayList<Course>) :
//        ArrayAdapter<Course>(activity, android.R.layout.simple_list_item_1, courses) {
//
//        override fun getView(position: Int, view: View?, parent: ViewGroup): View {
//            var view = view
//            // if we weren't given a view, inflate one
//            if (null == view) {
//                view = activity.layoutInflater
//                    .inflate(R.layout.list_item_course)
//            }
//
//            // configure the view for this Crime
//            val c = getItem(position)
//
//            val titleTextView = view!!.findViewById<View>(R.id.course_list_item_titleTextView) as TextView
//            titleTextView.text = c!!.courseName
//            val professorTextView = view.findViewById<View>(R.id.course_list_item_professorTextView) as TextView
//            professorTextView.setText(c.getProfessor())
//            val timeTextView = view.findViewById<View>(R.id.course_list_item_timeTextView) as TextView
//            timeTextView.setText(c.getTime())
//            val fotoPalestrante = view.findViewById<View>(R.id.foto) as ImageView
//            fotoPalestrante.setImageResource(c.getFoto())
//
//            listView.divider = null
//
//            return view
//        }
//    }
}
