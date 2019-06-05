package com.fusco2k.jofoa;

public class Course {

    String mCourseName;
    String mProfessor;
    String mTime;
    int mFoto;

    public Course(String courseName, String professor, String time, int foto) {
        setCourseName(courseName);
        setProfessor(professor);
        setTime(time);
        setFoto(foto);
    }

    public int getFoto() {
        return mFoto;
    }

    public void setFoto(int foto) {
        mFoto = foto;
    }

    public String getCourseName() {
        return mCourseName;
    }

    public void setCourseName(String courseName) {
        mCourseName = courseName;
    }

    public String getProfessor() {
        return mProfessor;
    }

    public void setProfessor(String professor) {
        mProfessor = professor;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

}
