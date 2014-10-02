package com.cognus.jofoa;

import java.util.ArrayList;

import android.content.Context;

public class CourseLab2 {
	
	private ArrayList<Course> mCourses;

    private static CourseLab2 sCourseLab;

    
    private CourseLab2(Context appContext) {

        mCourses = new ArrayList<Course>();

        Course c5 = new Course("Classe III Esquelética: Abordagem Ortodôntica-Cirúrgica", "Prof. Dr. João Gonçalves", "08:00 as 10:00", R.drawable.c5);
        mCourses.add(c5);
        Course c6 = new Course("Atendimento Inicial ao Politraumatismo de Face, o Cirurgião Dentista na Sala de Emergência", "Prof. Dr. Mário Francisco Real Gabrielli", "10:00 as 12:00", R.drawable.c6);
        mCourses.add(c6);
        Course c7 = new Course("Replicando Miméticamente a Anatomia de Dentes Posteriores com Resinas Compostas - Teórico", "Prof. Dr. Maciel Júnior", "14:00 as 16:00", R.drawable.c7);
        mCourses.add(c7);
        Course c8 = new Course("Replicando Miméticamente a Anatomia de Dentes Posteriores com Resinas Compostas - Hands On", "Prof. Dr. Maciel Jínior", "16:00 as 18:00", R.drawable.c7);
        mCourses.add(c8);
        Course c9 = new Course("Cirurgia Para a Extraço de Dentes Inclusos", "Prof. Dr. Roberto Henrique Barbeiro", "16:00 as 18:00", R.drawable.c9);
        mCourses.add(c9);
    }

    public static CourseLab2 get(Context c) {
        if (sCourseLab == null) {
            sCourseLab = new CourseLab2(c.getApplicationContext());
        }
        return sCourseLab;
    }

    public ArrayList<Course> getCourses() {
        return mCourses;
    }

}
