package com.mirea.work_8;

import java.util.ArrayList;

public interface IWaitList <E extends Comparable<E>> {
    void add(E element);
    Object remove();
    boolean contains(E element);
    boolean containsAll(ArrayList<E> c);
    boolean isEmpty();
}
