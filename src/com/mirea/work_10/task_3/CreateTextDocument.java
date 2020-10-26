package com.mirea.work_10.task_3;

/**
 * Класс фабрики текстовых документов.
 * методы возвращают объекты класса текстового документа {@link TextDocument}
 *
 */
public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new TextDocument();
    }
}
