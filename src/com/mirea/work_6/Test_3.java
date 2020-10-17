package com.mirea.work_6;

import java.util.ArrayList;
import java.util.Random;

import static java.util.Collections.sort;

public class Test_3 {
    public static void main(String[] args) {
        ArrayList<Student> students1 = getStudents(5);
        ArrayList<Student> students2 = getStudents(5);
        sort(students1, new SortingByGPA());
        sort(students2, new SortingByGPA());

        ArrayList<Student> students3 = mergeArray(students1, students2);
        System.out.println(students3.size());
        for (Object x : students3)
            System.out.println(x);


    }

    public static ArrayList<Student> getStudents(int size) {
        ArrayList<Student> students = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            students.add(new Student());
            students.get(i).setIdNumber(random.nextInt(100));
            students.get(i).setGPA(random.nextInt(4) + 2);
        }
        return students;
    }


    public static ArrayList<Student> mergeArray(ArrayList<Student> arrayA, ArrayList<Student> arrayB) {
        ArrayList<Student> arrayC = new ArrayList<Student>();
        int positionA = 0, positionB = 0;


        return arrayC;
    }
}
