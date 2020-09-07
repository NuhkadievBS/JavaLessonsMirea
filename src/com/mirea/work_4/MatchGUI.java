package com.mirea.work_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchGUI extends JFrame {
    int score1 = 0;
    int score2 = 0;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton(" Real Madrid");
    JLabel result = new JLabel(score1 + " : " + score2, SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Last scorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Draw", SwingConstants.CENTER);
    Font fnt = new Font("Times new roman",Font.PLAIN,20);

    MatchGUI() {
        super("Match");
        setLayout(new BorderLayout());
        //setLayout(new FlowLayout());
        setSize(500, 250);


        result.setFont(fnt);
        button1.setFont(fnt);
        button2.setFont(fnt);
        winner.setFont(fnt);
        lastScorer.setFont(fnt);

        add(button1, BorderLayout.WEST);
        add(result, BorderLayout.CENTER);
        add(button2, BorderLayout.EAST);
        add(lastScorer, BorderLayout.SOUTH);
        add(winner, BorderLayout.NORTH);


        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                score1++;
                result.setText(score1 + " : " + score2);
                lastScorer.setText("Last scorer: AC Milan");
                if (score1 > score2)
                    winner.setText("AC Milan wins");
                if (score2 == score1)
                    winner.setText("Draw");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                score2++;
                result.setText(score1 + " : " + score2);
                lastScorer.setText("Last scorer: Real Madrid");
                if (score2 > score1)
                    winner.setText("Real Madrid wins");
                if (score2 == score1)
                    winner.setText("Draw");
            }
        });
        setVisible(true);
    }
}