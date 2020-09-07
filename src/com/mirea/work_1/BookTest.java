package com.mirea.work_1;

public class BookTest {

    public static void main(String[] args) {
        Book book1 = new Book("Hemingway", Genre.NOVEL, "The old man and the sea");
        Book book2 = new Book("Huxley", Genre.UTOPY, "Brave new world");
        System.out.println(book1);
        System.out.println(book2);
    }
}
