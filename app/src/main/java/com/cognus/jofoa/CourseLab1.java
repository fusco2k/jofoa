package com.cognus.jofoa;

import java.util.ArrayList;

import android.content.Context;

public class CourseLab1 {
	
	private ArrayList<Course> mCourses;

    private static CourseLab1 sCourseLab;

    
    private CourseLab1(Context appContext) {

        mCourses = new ArrayList<Course>();

        Course c0 = new Course("Abertura Solene", "", "08:00", R.drawable.c0);
        mCourses.add(c0);
        Course c1 = new Course("Curso Internacional: Cirurgia de ATM", "Prof. Dr. Louis Mercuri", "09:00 as 12:00 (Parte 1)\n14:00 as 18:00 (Parte 2)\n", R.drawable.c1);
        mCourses.add(c1);
        Course c2 = new Course("Planejamento estético em facetas indiretas", "Prof. Dr. Luiz Rafael Calixto", "14:00 as 16:00", R.drawable.c2);
        mCourses.add(c2);
        Course c3 = new Course("Arquitetura e Ergonomia para seu consultório", "Prof. Dr. Alexandre Casarim", "16:00 as 18:00", R.drawable.c3);
        mCourses.add(c3);
        Course c4 = new Course("Cirurgia Plastica Periodontal", "Prof. Dr. Élcio Marcantônio Júnior", "19:00 as 21:00", R.drawable.c4);
        mCourses.add(c4);
    }

    public static CourseLab1 get(Context c) {
        if (sCourseLab == null) {
            sCourseLab = new CourseLab1(c.getApplicationContext());
        }
        return sCourseLab;
    }

    public ArrayList<Course> getCourses() {
        return mCourses;
    }

}
