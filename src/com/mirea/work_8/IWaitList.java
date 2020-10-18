package com.mirea.work_8;

import java.util.ArrayList;

/**
 * Интерфейс, декларирующий логику класса списка ожидания {@link WaitList}
 *
 * @param <E>
 */
public interface IWaitList <E extends Comparable<E>> {
    void add(E element);
    Object remove();
    boolean contains(E element);
    boolean containsAll(ArrayList<E> c);
    boolean isEmpty();
}
