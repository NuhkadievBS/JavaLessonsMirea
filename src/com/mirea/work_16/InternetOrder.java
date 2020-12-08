package com.mirea.work_16;

public class InternetOrder implements Order {

    class ListNode {
        ListNode next;
        ListNode prev;
        Item value;
    }


    int size;
    ListNode head;

    public InternetOrder(int size) {
        this.size = size;
    }

    @Override
    public boolean add(Item item) {
        if(item == null || itemQuantity() + 1 > size)
            return false;

        if(head == null) {
            head = new ListNode();
            head.value = item;
            head.next = head;
            head.prev = head;
        }
        // По itemQuantity найти своб место
        return true;
    }

    @Override
    public boolean remove(String itemName) {
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        return 0;
    }

    @Override
    public int itemQuantity() {
        if(head == null)
            return 0;
        ListNode it = head;
        int count = 0;
        do {
            count++;
            it = it.next;
        } while (it != null && it != head);

        return count;
    }

    @Override
    public int itemQuantity(String itemName) {
        if(head == null)
            return 0;
        ListNode it = head;
        int count = 0;
        do {
            if(it.value.getName().equals(itemName))
                count++;
            it = it.next;
        } while (it != null && it != head);

        return count;
    }

    @Override
    public Item[] getItems() {
        return new Item[0];
    }

    @Override
    public double costTotal() {
        return 0;
    }

    @Override
    public String[] itemNames() {
        return new String[0];
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        return new Item[0];
    }
}
