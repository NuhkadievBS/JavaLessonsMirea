package com.mirea.work_12.task_3;

import java.util.StringTokenizer;

public class Shirt {
    String series, name, color, size;

    boolean setValues(String shirt) {
        StringTokenizer tokenizer = new StringTokenizer(shirt, ",");
        if (tokenizer.countTokens() != 4)
            return false;
        series = tokenizer.nextToken();
        name = tokenizer.nextToken();
        color = tokenizer.nextToken();
        size = tokenizer.nextToken();
        return true;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "series='" + series + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
