package com.mirea.work_10.task_2;

/**
 * Класс клиента, содержит сеттер стула и метод sit(), имитирующий посадку на стул
 */
public class Client {
    public Chair chair;

    public void sit() {
        if(chair.hasLegs())
            System.out.println("Sitting on...");
        else System.out.println("Seems like I can't sit on this type of chair...");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
