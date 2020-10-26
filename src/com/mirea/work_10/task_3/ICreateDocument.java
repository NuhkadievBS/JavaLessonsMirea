package com.mirea.work_10.task_3;

/**
 * Класс абстрактной фабрики. Декларирует методы создания и открытия соответствующих документов.
 * Классы фабрик, реализующие интерфейс:
 * {@link CreateTextDocument}
 * {@link CreateMusicDocument}
 * {@link CreateImageDocument}
 *
 */
public interface ICreateDocument {
    IDocument CreateNew();
    IDocument CreateOpen();
}
