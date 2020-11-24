package com.mirea.work_11.task_1;

/**
 * Класс реализовывает один экземпляр очереди
 */
public class ArrayQueueModule {
    private static final int START_CAPACITY = 100; // Вместимость массива
    private static Object[] array;  // очередь будет создана на массиве
    private static int size; // размер очереди
    private static int head; // начало очереди
    private static int tail; // конец очереди

    // конструктор класса, выделяет память под массив и обнуляет индексы начала и конца очереди, а также ее размер
    public ArrayQueueModule() {
        array = new Object[START_CAPACITY];
        size = head = tail = 0;
    }

    // Метод, проверящий, нужно ли выделить больше памяти для очереди
    private static void ensureCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length << 1];
            int count = tail < head ? array.length - head : size;
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(array, 0, temp, count, tail);
            array = temp;
            head = 0;
            tail = size;
        }
    }

    // метод добавления элемента в очередь
    public static void enqueue(Object element) {
        assert element != null; // считаем, что добавляемый элемент != null
        ensureCapacity(size + 1); //
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    // Метод возвращающий первый элемент в очереди
    public static Object element() {
        assert size > 0; // считаем, что очередь - не пустая
        return array[head]; // возвращаем первый элемент очереди
    }

    // Метод, удаляет первый элемент в очереди
    public static Object dequeue() {
        assert size > 0;
        Object result = element();
        array[head] = null;
        size--;
        head = (head + 1) % array.length;
        return result;
    }

    // метод, возвращающий размер очереди
    public static int size() {
        return size;
    }

    // метод, проверящий, не пустая ли очередь
    public static boolean isEmpty() {
        return size == 0;
    }

    // Метод очистки очереди
    public static void clear() {
        size = head = tail = 0; // Обнуляем размер и индексы начала и конца очереди
        array = new Object[START_CAPACITY]; // Выделяем новую память под очередь
    }

    // Метод, возвращающий очередь в виде массива
    public static Object[] toArray() {
        Object[] temp = new Object[size];
        int count = tail < head ? array.length - head : size;
        System.arraycopy(array, head, temp, 0, count);
        if (tail < head)
            System.arraycopy(array, 0, temp, count, tail);
        return temp;
    }

}
