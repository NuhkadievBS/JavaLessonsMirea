package com.mirea.work_9.inn_task;

import java.io.IOException;

public class BadUserException extends IOException {

    public BadUserException(String message) {
        super(message);
    }
}
