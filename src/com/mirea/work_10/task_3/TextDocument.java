package com.mirea.work_10.task_3;


/**
 * Класс текстового документа.
 * В своих методах выводит на консоль строку, дающую знать, что мы открываем и создаем именно ТЕКСТОВЫЙ ДОКУМЕНТ
 */
public class TextDocument implements IDocument{
    @Override
    public void openDocument() {
        System.out.println("Opening TEXT document");
    }

    @Override
    public void newDocument() {
        System.out.println("Creating TEXT document");
    }

}
