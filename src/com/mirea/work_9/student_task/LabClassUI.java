package com.mirea.work_9.student_task;

public interface LabClassUI {
    void sortByGPA();

    Student searchByName(String name) throws StudentNotFoundException;

    void printOutStudents();

    void addStudent(String name, Double ID) throws EmptyStringException;
}
