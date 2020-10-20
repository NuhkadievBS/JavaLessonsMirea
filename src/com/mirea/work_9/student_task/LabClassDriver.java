package com.mirea.work_9.student_task;

public class LabClassDriver {

    public static void main(String[] args) throws EmptyStringException {
        LabClassUI labClassUI = new LabClass();

        labClassUI.addStudent("Jack", 5.0);
        labClassUI.addStudent("Jill", 3.5);
        labClassUI.addStudent("John", 4.2);
        labClassUI.addStudent("Jackie", 4.0);

        labClassUI.printOutStudents();

        labClassUI.sortByGPA();
        System.out.println();

        labClassUI.printOutStudents();
    }
}
