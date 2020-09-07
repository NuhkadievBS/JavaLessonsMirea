package com.mirea.work_3;

public class Circle extends Shape {
    protected double radius;

    public Circle(double radius, String color, Boolean fill) {
        super(color, fill);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle, radius = " + this.radius;
    }
}
