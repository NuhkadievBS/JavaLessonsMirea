package com.mirea.work_11.task_2;

public class LinkedQueue extends AbstractQueue {

    private Node tail; // Звено начала очереди
    private Node head; // Звено конца очереди

    // Метод добавления элемента в очередь
    protected void enqueueRealisation(Object element) {
        tail = new Node(element, null, tail); // Инициализируем звено конца очереди с новым элементом
        if (head == null) // если звено начала не инициализировано, присваиваем ему значение конца очереди
            head = tail;
        else
            tail.next.prev = tail;
    }

    // метод возвращает значение звена начала очереди
    protected Object elementRealisation() {
        return head.value;
    }

    // метод удаляет последний элемент очереди посредством удаления связи с последним элементом
    protected void dequeueRealisation() { //
        if (head.prev != null) head.prev.next = null;
        head = head.prev;

    }


    private class Node {
        Object value;
        Node prev;
        Node next;

        Node(Object element, Node prev, Node next) {
            value = element;
            this.prev = prev;
            this.next = next;
        }
    }

}
