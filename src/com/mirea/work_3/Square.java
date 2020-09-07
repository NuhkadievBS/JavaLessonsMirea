package com.mirea.work_3;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean fill) {
        super(side, side, color, fill);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double size) {
        super.setLength(size);
        super.setWidth(size);
    }

    @Override
    public String toString() {
        return "Square{}";
    }

}
