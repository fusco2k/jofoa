package com.cognus.jofoa;

import java.util.ArrayList;

import android.content.Context;

public class CourseLab4 {
	
	private ArrayList<Course> mCourses;

    private static CourseLab4 sCourseLab;

    
    private CourseLab4(Context appContext) {

        mCourses = new ArrayList<Course>();

        Course c14 = new Course("Disfuncções Temporomandibulares e Cefaléias em Crianças e Adolescentes", "Dr. Marco Antonio Arruda", "08:00 as 12", R.drawable.c141);
        mCourses.add(c14);
        Course c15 = new Course("Osteonecrose por Bifosfatos, a Visão do Cirurgião", "Profa. Dra. Águida Maria Menezes Aguiar Miranda", "10:00 as 12:00", R.drawable.c15);
        mCourses.add(c15);
        Course c23 = new Course("Jornada Acadêmica", "Apresentações de Painéis e Apresentações Orais", "08:00 as 16:00", R.drawable.c0);
        mCourses.add(c23);
        Course c16 = new Course("Sistemas Cerâmicos para Laminados Ultrafinos, Facetas e Coroas: Da Indicação à Cimentação", "Prof. Dr. Hamilton Pedrozzi", "14:00 as 16:00", R.drawable.c16);
        mCourses.add(c16);
        Course c22 = new Course("Jornada Acadêmica", "Tabulação de Resultados e Publicação das Menções Honrosas e dos Classificados para as Finais", "16:00 as 18:00", R.drawable.c0);
        mCourses.add(c22);
    }

    public static CourseLab4 get(Context c) {
        if (sCourseLab == null) {
            sCourseLab = new CourseLab4(c.getApplicationContext());
        }
        return sCourseLab;
    }

    public ArrayList<Course> getCourses() {
        return mCourses;
    }

}
