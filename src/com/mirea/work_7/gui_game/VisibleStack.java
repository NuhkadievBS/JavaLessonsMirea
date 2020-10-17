package com.mirea.work_7.gui_game;

import javax.swing.*;
import java.awt.*;

public class VisibleStack extends JComponent {
    private static final long serialVersionUID = 1L;
    private Color color;
    private int type;
    private String text;

    // параметры: цвет и тип фигуры
    VisibleStack() {
        this.color = Color.GREEN;
        this.text = "Nigga";
        setOpaque(false);
    }

}
