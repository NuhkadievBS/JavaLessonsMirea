package com.mirea.work_8;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Класс реализовывает интерфейс IWaitList {@link IWaitList}
 * и является базовым для классов {@link UnfairWaitList}, {@link BoundedWaitList}.
 * Список ожидания, базированный на очереди {@link ConcurrentLinkedQueue}
 * Список ожидания работает по принципу FIFO (first-in-first-out).
 * Логика реализована в соответствии с этим принципом: {@code add}, {@code remove}
 *
 * В классе реализованы некоторые методы, присущие Java коллекциям:
 * {@code toString}, {@code contains}, {@code isEmpty}, {@code containsAll}
 *
 * @param <E> тип элементов, содержащихся в списке
 */
public class WaitList <E extends Comparable<E>> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() { content = new ConcurrentLinkedQueue<>(); }

    public WaitList(ConcurrentLinkedQueue<E> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for(Object x : content) {
            result += x.toString() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += " ]";
        return result;
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(ArrayList<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

}
