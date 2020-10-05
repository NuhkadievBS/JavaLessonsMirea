package com.mirea.work_6;

import java.util.Random;

import static java.util.Arrays.sort;

public class Test_1_2 {
    public static void main(String[] args) {

        //TASK 1: Сортировка вставками
        Student[] students1 = getStudents(5);
        insertionSort(students1);
        for (Object student : students1)
            System.out.println(student);

        //Task 2: Быстрая сортировка
        Student[] students2 = getStudents(5);

        // метод sort() сортирует быстрой сортировкой, получая вторым параметром экземпляр компаратора
        sort(students2, new SortingByGPA());
        System.out.println('\n');
        for (Object student : students2) // вывод результата
            System.out.println(student);

    }

    // генерация значений для массивов
    public static Student[] getStudents(int size) {
        Student[] students = new Student[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            students[i] = new Student();
            students[i].setIdNumber(random.nextInt(100));
            students[i].setGPA(random.nextInt(4) + 2);
        }
        return students;
    }

    //функция сортировки вставками
    public static void insertionSort(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i; j > 0; j--) {
                if (students[j].compareTo(students[j - 1]) > 0) {
                    Student tmp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = tmp;
                }
            }
        }
    }


}
