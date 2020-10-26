package com.mirea.work_10.task_3;


/**
 * Класс фабрики музыкальных документов.
 * методы возвращают объекты класса текстового документа {@link MusicDocument}
 *
 */
public class CreateMusicDocument implements ICreateDocument{
    @Override
    public IDocument CreateNew() {
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen() {
        return new MusicDocument();
    }
}
