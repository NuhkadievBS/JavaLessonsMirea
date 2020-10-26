package com.mirea.work_9.inn_task;

import java.util.HashSet;

public class INN {
    HashSet<User> dataBase; // Данные клиентов, реализована на основе HashSet

    // Инициализация хранилища данных
    public INN() {
        dataBase = new HashSet<>();
    }

    // метод добавления нового пользователя
    public void addNewUser(User user) throws BadUserException {
        if(this.Contains(user)) // Если пользователь уже есть в базе, то выбрасывает исключение
            throw new BadUserException("This ID is already in database: " + user.getID());
        dataBase.add(user);
    }

    // Метод вывода содержимого базы в консоль
    public void printDataBase() {
        for(Object x : dataBase) {
            System.out.println(x);
        }
    }

    // Метод возвращающий true, если пользователь уже содержится в базе:
    // для этого достаточно проверить ID, иначе - false
    public boolean Contains(User x) {
        for (User currentUser : dataBase) {
            if(x.getID().equals(currentUser.getID()))
                return true;
        }
        return false;
    }

}
