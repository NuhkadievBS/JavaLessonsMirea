package com.mirea.work_9.inn_task;

import java.io.IOException;

/**
 * Исключение BadUserException, используемое при некорректных данных в классе пользователя {@link User},
 * а также в классе реализующем логику базы данных ИНН {@link INN}
 */
public class BadUserException extends IOException {

    public BadUserException(String message) {
        super(message);
    }
}
