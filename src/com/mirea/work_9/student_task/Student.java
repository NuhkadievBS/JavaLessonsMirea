package com.mirea.work_9.student_task;

/**
 * Класс реализует логику студента. У студента есть имя и средний балл.
 */
public class Student {
    private final String name;
    private final Double GPA;

    public Student(String name, double GPA) throws EmptyStringException {
        if(name.isEmpty())
            throw new EmptyStringException("Name cannot be an empty string");
        this.name = name;
        this.GPA = GPA;
    }

    public Integer compareTo(Student student) {
        return GPA.compareTo(student.getGPA());
    }

    public Double getGPA() {
        return GPA;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
