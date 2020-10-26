package com.mirea.work_9.student_task;

import java.io.IOException;

/**
 * Исключение, выбрасываемое в случае, поиск студента окажется неудачным
 */
public class StudentNotFoundException extends IOException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
