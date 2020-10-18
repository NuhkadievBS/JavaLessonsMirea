package com.mirea.work_8;

/**
 * Класс ограниченной очереди ожидания, отличается от {@link WaitList} ограниченностью количества элементов.
 * Для этого в конструкторе задается вместимость списка ожидания capacity.
 *
 * @param <E>
 */
public class BoundedWaitList<E extends Comparable<E>> extends WaitList<E> {
    int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if(content.size() < capacity)
            super.add(element);
        else throw new OutOfMemoryError("Out of capacity");
    }

}
