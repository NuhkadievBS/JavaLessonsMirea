package com.mirea.work_9.inn_task;

/**
 * Класс User, описывающий логику пользователя:
 * имеет поля имени name и идентификационного номера ID.
 *
 */
public class User {
    private String name;
    private String ID;

    // В конструкторе производится присвоение значений полям name и ID
    public User(String name, String ID) throws BadUserException {
        checkID(ID);
        this.name = name;
        this.ID = ID;
    }


    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    // Частный вспомогательный метод, проверяющий соответствие стандарту введенного ID.
    private void checkID(String currentID) throws BadUserException {
        if (currentID.length() != 12)
            throw new BadUserException("Incorrect INN number. INN must contain 12 digits");

        try {
            Long.parseLong(currentID);
        } catch (NumberFormatException e) {
            throw new BadUserException("Incorrect INN input. INN must contain 12 DIGITS.");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
