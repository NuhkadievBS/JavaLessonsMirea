package com.mirea.work_6;

public class Student implements Comparable<Student>{
    private Integer idNumber;
    private Integer GPA;

    public Integer getGPA() {
        return GPA;
    }

    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }


    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "idNumber=" + idNumber + "; GPA=" + GPA;
    }


    @Override
    public int compareTo(Student o) {
        return idNumber.compareTo(o.getIdNumber());
    }
}
