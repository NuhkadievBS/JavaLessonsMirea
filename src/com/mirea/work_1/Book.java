package com.mirea.work_1;

public class Book {
    private String author;
    private Genre genre;
    private String name;

    public Book(String author, Genre genre, String name) {
        this.author = author;
        this.genre = genre;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is a " + genre.toString().toLowerCase() + " writtend by " + author;
    }
}
