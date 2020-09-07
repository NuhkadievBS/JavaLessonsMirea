package com.mirea.work_1;

public class BallTest {

    public static void main(String[] args) {
        Ball ball1 = new Ball("red", BallType.FOOTBALL);
        Ball ball2 = new Ball("yellow", BallType.BASKETBALL);
        Ball ball3 = new Ball("green", BallType.TENNISBALL);
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
