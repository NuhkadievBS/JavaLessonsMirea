package com.mirea.work_10.task_3;


/**
 * Класс фабрики изображений.
 * методы возвращают объекты класса текстового документа {@link ImageDocument}
 *
 */
public class CreateImageDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new ImageDocument();
    }
}
