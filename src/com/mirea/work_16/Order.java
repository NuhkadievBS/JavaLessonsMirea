package com.mirea.work_16;

public interface Order {
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int itemQuantity();
    int itemQuantity(String itemName);
    Item[] getItems();
    double costTotal();
    String[] itemNames();
    Item[] sortedItemsByCostDesc();
}
