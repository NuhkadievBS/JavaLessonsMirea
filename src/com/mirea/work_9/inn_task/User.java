package com.mirea.work_9.inn_task;

public class User {
    private String name;
    private String ID;

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
