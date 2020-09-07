package com.mirea.work_3;
public abstract class Shape {
    protected String color;
    protected Boolean fill;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return fill;
    }

    public void setFilled(Boolean fill) {
        this.fill = fill;
    }

    public Shape(String color, Boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public Shape() {
    }
    abstract double getArea();

    abstract double getPerimeter();

}
