package com.mirea.work_11.task_2;

public interface Queue {
    /**
     * INV: size' = size + 1
     * Pre: element != null, element immutable
     * Post: queue'[0...size - 1] = queue[0...size - 1]
     * Post: queue'[size' - 1] =  element
     */
    void enqueue(Object element);

    /**
     * Pre: size > 0
     * Post: Result = queue[0]
     */
    Object element();

    /**
     * INV: size' = size - 1
     * Pre: size > 0
     * Post: queue'[0...size - 1] = queue[1...size - 1]
     * Post: Result = queue[0]
     */
    Object dequeue();

    /**
     * Post: Result = size
     */
    int size();

    /**
     * Post: Result = size > 0?
     */
    boolean isEmpty();

    /**
     * INV: size' = 0;
     * Post: Clear the queue
     */
    void clear();

    /**
     * Post: Result = queue[0...size - 1]
     */
    Object[] toArray();
}
