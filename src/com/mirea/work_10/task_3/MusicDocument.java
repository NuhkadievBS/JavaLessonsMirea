package com.mirea.work_10.task_3;


/**
 * Класс документа музыки.
 * В своих методах выводит на консоль строку, дающую знать, что мы открываем и создаем именно МУЗЫКАЛЬНЫЙ ФАЙЛ
 */
public class MusicDocument implements IDocument {
    @Override
    public void openDocument() {
        System.out.println("Opening MUSIC document");
    }

    @Override
    public void newDocument() {
        System.out.println("Creating MUSIC document");
    }
}
