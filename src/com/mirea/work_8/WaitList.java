package com.mirea.work_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public abstract class WaitList <E extends Comparable<E>> implements IWaitList<E> {
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
    public Object remove() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean containsAll(ArrayList<E> c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(5);
        queue.add(76);
        queue.add(54);
        queue.add(33);
        queue.add(6);
    }
}
