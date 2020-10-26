package com.mirea.work_10.task_3;


/**
 * Класс документа изображения.
 * В своих методах выводит на консоль строку, дающую знать, что мы открываем и создаем именно ИЗОБРАЖЕНИЕ
 */
public class ImageDocument implements IDocument{
    @Override
    public void openDocument() {
        System.out.println("opening IMAGE document");
    }

    @Override
    public void newDocument() {
        System.out.println("creating IMAGE document");
    }
}
