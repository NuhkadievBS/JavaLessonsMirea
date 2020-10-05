package com.mirea.work_6;

import java.util.Comparator;

public class SortingByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() > o2.getGPA())
            return -1;
        else if (o1.getGPA() < o2.getGPA())
            return 1;
        else
            return 0;
    }
}
