package com.mirea.work_10.task_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Класс интерфейса приложения. По сути это лишь меню файла. Сигналы о выполнении действий выводятся на консоль,
 * Поэтому рекомендуется наблюдать за консолью во время проверки программы.
 *
 */
public class FrameUI extends JFrame {

    IDocument document;
    ICreateDocument createDocument;
    public FrameUI(ICreateDocument createDocument) {
        super("System Menu");
        this.createDocument = createDocument;
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);


        // Открытие окна
        setSize(300, 200);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("File");
        JMenuItem create = new JMenuItem("New"); // Пункт меню для создания файла
        JMenuItem open = new JMenuItem("Open"); // Пункт меню для открытия файла
        JMenuItem save= new JMenuItem("Save"); // Пункт меню для сохранения файла

        // Пункт меню из команды с выходом из программы
        JMenuItem exit = new JMenuItem(new ExitAction());

        // Добавление в меню соответствующих пунктов
        file.add(create);
        file.add(open);
        file.add(save);

        // Добавление разделителя
        file.addSeparator();
        file.add(exit);

        // В случае нажатия на кнопку создания нового файла, сигнализируем об этом в консоль
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document =  createDocument.CreateNew();
                document.newDocument();
            }
        });

        // В случае нажатия на кнопку открытия файла, сигнализируем об этом в консоль
        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                document = createDocument.CreateOpen();
                document.openDocument();
            }
        });

        // В случае нажатия на кнопку сохранения файла, сигнализируем об этом в консоль
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Saving....");
            }
        });

        return file;
    }

    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}
