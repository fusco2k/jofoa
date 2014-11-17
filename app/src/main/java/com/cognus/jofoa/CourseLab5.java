package com.cognus.jofoa;

import android.content.Context;

import java.util.ArrayList;

public class CourseLab5 {

    private ArrayList<Course> mCourses;

    private static CourseLab5 sCourseLab;


    private CourseLab5(Context appContext) {

        mCourses = new ArrayList<Course>();

        Course c19 = new Course("Jornada Acadêmica: Final", "", "08:00 as 12:00", R.drawable.c0);
        mCourses.add(c19);
        Course c17 = new Course("Instrumentação Rotatória e reciprocamente - Mtwo e Reciproc - Hands On", "Prof. Dr. Mário Tanomaru", "08:00 as 12:00", R.drawable.c17);
        mCourses.add(c17);
        Course c18 = new Course("Endodontia Minimamente Invasiva e Conservadora", "Prof. Dr. Mário Roberto Leonardo", "14:00 as 18:00", R.drawable.c18);
        mCourses.add(c18);
        Course c20 = new Course("Coquetel de Encerramento e Entrega dos Prêmios da Jornada Acadêmica", "", "20:30", R.drawable.c0);
        mCourses.add(c20);
    }

    public static CourseLab5 get(Context c) {
        if (sCourseLab == null) {
            sCourseLab = new CourseLab5(c.getApplicationContext());
        }
        return sCourseLab;
    }

    public ArrayList<Course> getCourses() {
        return mCourses;
    }

}
