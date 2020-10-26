package com.mirea.work_10.task_3;

import javax.swing.*;

/**
 * Класс DriveUI, содержащий метод main , по сути имитирует выбор фабрики документов типа:
 * текстовый документ {@link TextDocument}
 * музыкальный файл {@link MusicDocument}
 * изображение {@link ImageDocument}
 */
public class DriveUI {

    public static void main(String[] args)
    {
        ICreateDocument createDocument = new CreateTextDocument();
        JFrame.setDefaultLookAndFeelDecorated(true);
        new FrameUI(createDocument);

    }
}
