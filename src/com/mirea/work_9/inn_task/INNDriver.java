package com.mirea.work_9.inn_task;

import java.util.Scanner;

public class INNDriver {

    public static void main(String[] args) throws BadUserException {
        INN manager = new INN(); // Инициализация объекта, содержащего логику обращения с ИНН

        // Создание нескольких пользователей
        User user1 = new User("Jack Ryan", "200324594234");
        User user2 = new User("Jill Anderson", "234532453453");
        User user3 = new User("John Malkovich", "423423534567");
        User user4 = new User("Jackie Chan", "546454345345");

        // Ввод их в базу
        manager.addNewUser(user1);
        manager.addNewUser(user2);
        manager.addNewUser(user3);
        manager.addNewUser(user4);

        manager.printDataBase(); // Вывод информации о пользователях
        System.out.println(manager.Contains(user2)); // Проверяем входит ли user2 в базу


        // Пользователю дается возможность дополнить новым пользователем для проверки функционала
        System.out.println("Try adding new client: ");
        Scanner scanner = new Scanner(System.in);
        User user5 = new User(scanner.nextLine(), scanner.nextLine());
        manager.addNewUser(user5);
        manager.printDataBase();


    }
}
