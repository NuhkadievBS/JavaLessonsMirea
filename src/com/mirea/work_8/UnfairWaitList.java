package com.mirea.work_8;

/**
 * Класс нечестного списка ожидания. Дополняет логику {@link WaitList},
 * Переписывая метод {@code remove}, позволяя удалять элемент не из начала списка.
 * Также добавлен метод {@code moveToBack}, переносящий элемент в конец очереди
 *
 * @param <E>
 */
public class UnfairWaitList <E extends Comparable<E>> extends WaitList<E> {

    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.remove(element);
        content.add(element);
    }

}
