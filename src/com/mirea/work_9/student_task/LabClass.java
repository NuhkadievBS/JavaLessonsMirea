package com.mirea.work_9.student_task;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Класс лабораторной работы. содержит список студентов и методы работы с ними:
 * сортировка по среднему баллу, поиск студента, вывод списка студентов, добавление студента в список
 */
public class LabClass implements LabClassUI {

    ArrayList<Student> students; // список студентов

    public LabClass() {
        students = new ArrayList<>();
    }


    @Override
    public void sortByGPA() {
        Comparator c = (o1, o2) -> ((Student) o1).compareTo((Student) o2);
        students.sort(c); // сортируем встроенным методом с помощью компаратора
    }


    //Метод поиска студента по имени
    @Override
    public Student searchByName(String name) throws StudentNotFoundException {
        for (Student x : students) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        throw new StudentNotFoundException("No such student in database: " + name);
    }

    // Метод вывода списка студентов на консоль
    @Override
    public void printOutStudents() {
        for (Object x : students) {
            System.out.println(x);
        }
    }

    //Метод добавления нового студента в список
    @Override
    public void addStudent(String name, Double ID) throws EmptyStringException {
        Student student = new Student(name, ID);
        students.add(student);
    }


}
