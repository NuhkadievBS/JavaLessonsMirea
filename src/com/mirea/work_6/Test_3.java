package com.mirea.work_6;

import static com.mirea.work_6.Test_1_2.getStudents;


public class Test_3 {
    public static void main(String[] args) {
        // Task 3: сортировка слиянием двух списков и объединение их слиянием
        Student[] students1 = getStudents(5); // генерация двух списков студентов
        Student[] students2 = getStudents(10);
        // Вывод неотсортированных значений
        for (Object x : students1)
            System.out.println(x);
        for (Object x : students2)
            System.out.println(x);
        System.out.println('\n');

        // Для того, чтобы произвести слияное нужно сначала отсортировать массивы, а затем объединять их
        students1 = MergeClass.sortArray(students1); // Сортировка первого массива студентов
        students2 = MergeClass.sortArray(students2); // Сортировка второго массива студентов
        Student[] student3 = MergeClass.mergeArray(students1, students2); // Слияние массивов в третий

        //Вывод результата
        for (Object x : student3)
            System.out.println(x);
    }

}
