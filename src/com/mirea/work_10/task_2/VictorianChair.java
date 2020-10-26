package com.mirea.work_10.task_2;


/**
 * Викторианский стул, особенностью является наличие возраста age
 */
public class VictorianChair implements Chair {
    private int age;

    public int getAge() {
        return  age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public boolean hasLegs() {
        return true;
    }
}
