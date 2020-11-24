package com.mirea.work_11.task_1;

public class Test {
    public static void main(String[] args) {

        // Тест класса ArrayQueueModule
        Object[] queue1;
        new ArrayQueueModule();
        ArrayQueueModule.enqueue(5);
        ArrayQueueModule.enqueue(6);
        ArrayQueueModule.enqueue(8);
        ArrayQueueModule.enqueue(9);
        ArrayQueueModule.dequeue();
        queue1 = ArrayQueueModule.toArray();
        for(Object i : queue1) {
            System.out.println(i);
        }

        System.out.println();
        // Тест класса ArrayQueueADT
        Object[] queue2;
        ArrayQueueADT adt = new ArrayQueueADT();
        ArrayQueueADT.enqueue(adt, 7);
        ArrayQueueADT.enqueue(adt, 3);
        ArrayQueueADT.enqueue(adt, 4);
        queue2 = ArrayQueueADT.toArray(adt);
        for(Object x : queue2) {
            System.out.println(x);
        }

        System.out.println();
        // Тест класса ArrayQueue
        Object[] queue3;
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(25);
        arrayQueue.enqueue(17);
        arrayQueue.enqueue(0);
        arrayQueue.dequeue();
        queue3 = arrayQueue.toArray();
        for(Object x : queue3) {
            System.out.println(x);
        }

    }
}
