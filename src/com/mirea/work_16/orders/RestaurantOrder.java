package com.mirea.work_16.orders;

import com.mirea.work_16.Customer;
import com.mirea.work_16.items.Item;

import java.util.Arrays;

public class RestaurantOrder implements Order {
    int size = 0;
    Item[] items = new Item[0];
    Customer customer;

    private boolean checkName(String[] menuItems, String item) {
        for (String menuItem : menuItems) {
            if (menuItem.equals(item)) return true;
        }
        return false;
    }

    private boolean checkName(Item[] menuItems, Item item) {
        for (Item menuItem : menuItems) {
            if (menuItem.getName().equals(item.getName())) return true;
        }
        return false;
    }

    @Override
    public boolean add(Item menuItem) {
        Item[] newArray = Arrays.copyOf(items, items.length + 1);
        newArray[items.length] = menuItem;
        items = newArray;
        size++;
        return true;
    }

    @Override
    public String[] itemNames() {
        String[] itemNames = new String[0];
        for (Item item : items) {
            if (!checkName(itemNames, item.getName())) {
                String[] newArray = Arrays.copyOf(itemNames, itemNames.length + 1);
                newArray[itemNames.length] = item.getName();
                itemNames = newArray;
            }
        }
        return itemNames;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) count++;
        }
        return count;
    }

    @Override
    public int itemQuantity(Item itemName) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName.getName())) count++;
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        Item[] itemNames = new Item[0];
        for (Item item : items) {
            if (!checkName(itemNames, item)) {
                Item[] newArray = Arrays.copyOf(itemNames, itemNames.length + 1);
                newArray[itemNames.length] = item;
                itemNames = newArray;
            }
        }
        return itemNames;
    }

    @Override
    public boolean remove(String itemName) {
        if (itemQuantity(itemName) == 0) return false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(itemName)) {
                if (items.length - 1 - i >= 0) System.arraycopy(items, i + 1, items, i, items.length - 1 - i);
                items = Arrays.copyOf(items, items.length - 1);
                break;
            }
        }
        size--;
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        while (itemQuantity(itemName) != 0) {
            for (int i = 0; i < items.length; i++) {
                if (items[i].getName().equals(itemName)) {
                    if (items.length - 1 - i >= 0) System.arraycopy(items, i + 1, items, i, items.length - 1 - i);
                    items = Arrays.copyOf(items, items.length - 1);
                    size--;
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] menuItems = getItems();
        for (int i = 0; i < menuItems.length; i++) {
            for (int j = i; j < menuItems.length; j++) {
                if (menuItems[i].getCost() < menuItems[j].getCost()) {
                    Item tmp;
                    tmp = menuItems[i];
                    menuItems[i] = menuItems[j];
                    menuItems[j] = tmp;
                }
            }
        }
        return menuItems;
    }

    @Override
    public double costTotal() {
        Item[] menuItems = getItems();
        int cost = 0;
        for (Item menuItem : menuItems) {
            cost += menuItem.getCost() * itemQuantity(menuItem);
        }
        return cost;
    }


    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
