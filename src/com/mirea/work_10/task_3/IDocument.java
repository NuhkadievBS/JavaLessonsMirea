package com.mirea.work_10.task_3;

/**
 * Интерфейс, декларирующий общие методы документов.
 * В данном случае ограничимся методами выполнения открытия и создания документов.
 * Классы, реализующие интерфейс:
 * {@link ImageDocument}
 * {@link MusicDocument}
 * {@link TextDocument}
 *
 */
public interface IDocument {
    void openDocument();
    void newDocument();
}
