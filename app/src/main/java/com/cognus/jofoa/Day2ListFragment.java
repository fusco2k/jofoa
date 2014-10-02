package com.cognus.jofoa;

import java.util.ArrayList;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Day2ListFragment extends ListFragment {
	
	public static final String TAG = "Course2";
	 private ArrayList<Course> mCourses;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mCourses = CourseLab2.get(getActivity()).getCourses();
        CourseAdapter adapter = new CourseAdapter(mCourses);
		setListAdapter(adapter);
	}
	
	@Override
    public void onListItemClick(ListView l, View v, int position, long id) { 
        Course c = (Course)(getListAdapter()).getItem(position);
        Log.d(TAG, c.getCourseName() + " was clicked");
    }

    private class CourseAdapter extends ArrayAdapter<Course> {
        public CourseAdapter(ArrayList<Course> courses) {
            super(getActivity(), android.R.layout.simple_list_item_1, courses);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // if we weren't given a view, inflate one
            if (null == convertView) {
                convertView = getActivity().getLayoutInflater()
                    .inflate(R.layout.list_item_course, null);
            }

            // configure the view for this Crime
            Course c = getItem(position);

            TextView titleTextView =(TextView)convertView.findViewById(R.id.course_list_item_titleTextView);
            titleTextView.setText(c.getCourseName());
            TextView professorTextView =(TextView)convertView.findViewById(R.id.course_list_item_professorTextView);
            professorTextView.setText(c.getProfessor().toString());
            TextView timeTextView =(TextView)convertView.findViewById(R.id.course_list_item_timeTextView);
            timeTextView.setText(c.getTime().toString());
            ImageView fotoPalestrante = (ImageView)convertView.findViewById(R.id.foto);
            fotoPalestrante.setImageResource(c.getFoto());

            return convertView;
        }
    }

}
