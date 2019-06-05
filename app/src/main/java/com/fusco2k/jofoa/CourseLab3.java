package com.fusco2k.jofoa;

import android.content.Context;

import java.util.ArrayList;

public class CourseLab3 {

    private ArrayList<Course> mCourses;

    private static CourseLab3 sCourseLab;


    private CourseLab3(Context appContext) {

        mCourses = new ArrayList<Course>();

        Course c10 = new Course("Planejamento Virtual e Confecção de Guias Cirúrgicas", "Prof. Dr. Élcio Marcantônio Júnior", "08:00 as 10:00", R.drawable.c4);
        mCourses.add(c10);
        Course c11 = new Course("Atendendo Pacientes com Doenças Oncológicas", "Profa. Dra. Mária Elvira Pizzigatti Correa", "10:00 as 12:00", R.drawable.c11);
        mCourses.add(c11);
        Course c12 = new Course("Carcinogênese Bucal Experimental", "Prof. Dr. Daniel Araki Ribeiro", "14:00 as 16:00 ", R.drawable.c12);
        mCourses.add(c12);
        Course c13 = new Course("Aperfeiçoe Sua Atividade Clínica Identificando As Principais Doenças Diagnosticadas na Clínica Odontológica", "Dr. Fábio de Abreu Alves", "16:00 as 18:00", R.drawable.c13);
        mCourses.add(c13);
        Course c21 = new Course("Jornada Acadêmica", "Apresentações de Painéis e Apresentações Orais", "14:00 as 18:00", R.drawable.c0);
        mCourses.add(c21);
    }

    public static CourseLab3 get(Context c) {
        if (sCourseLab == null) {
            sCourseLab = new CourseLab3(c.getApplicationContext());
        }
        return sCourseLab;
    }

    public ArrayList<Course> getCourses() {
        return mCourses;
    }

}
