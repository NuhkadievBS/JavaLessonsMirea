package com.mirea.work_7.gui_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameInterface extends JFrame {
    JButton generateDecks;
    JLabel firstDeck;
    JLabel secondDeck;
    Font fnt;

    public GameInterface() throws HeadlessException {
        super("Game on");
        setSize(500, 250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setDefaults();

        setVisible(true);
    }

    private void setDefaults() {
        fnt = new Font("Times new roman",Font.PLAIN,20);
        generateDecks = new JButton("Start game");
        add(generateDecks, BorderLayout.SOUTH);
        generateDecks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                repaint();
                VisibleStack visibleStack = new VisibleStack();
                visibleStack.setBounds(10, 40, 120, 120);
            }
        });
    }

    public void drawStack() {

    }


    public static void main(String[] args) {
        GameInterface gameInterface = new GameInterface();
    }
}
