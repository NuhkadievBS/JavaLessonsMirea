package com.mirea.work_1;

public class Ball {
    private String color;
    private BallType ballType;

    public Ball(String color, BallType ballType) {
        this.color = color;
        this.ballType = ballType;
    }

    @Override
    public String toString() {
        return color + " " + ballType.toString().toLowerCase() + " is printed";
    }

}
