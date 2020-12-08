package com.mirea.work_16;

public class RestaurantOrder implements Order {
    private int size;
    private Item[] items;

    public RestaurantOrder(int size) {
        this.size = size;
        items = new Item[this.size];
    }

    @Override
    public boolean add(Item item) {
        if (item == null)
            return false;

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(String itemName) {
        if (itemName == null)
            return false;

        for (int i = 0; i < itemQuantity(); i++) {
            if (items[i].equals(itemName)) {
                items[i] = null;
                return true;
            }
        }

        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int counter = 0;

        for(int i = 0; i < itemQuantity(); i++) {
            if(items[i].equals(itemName)) {
                items[i] = null;
                counter++;
            }
        }

        return counter;
    }

    @Override
    public int itemQuantity() {
        int counter = 0;
        for (Item x : items) {
            if (x == null)
                break;
            counter++;
        }
        return counter;
    }

    @Override
    public int itemQuantity(String itemName) {
        int counter = 0;
        for (Item x : items) {
            if (x == null)
                break;
            if (x.getName().equals(itemName))
                counter++;
        }
        return counter;
    }

    @Override
    public Item[] getItems() {
        return items;
    }

    @Override
    public double costTotal() {
        double total = 0;
        for (Item x : items) {
            if (x == null)
                break;
            ;
            total += x.getCost();
        }

        return total;
    }

    @Override
    public String[] itemNames() {
        String[] names = new String[itemQuantity()];
        for (int i = 0; i < itemQuantity(); i++) {
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        return null;
    }

    public static void main(String[] args) {
        RestaurantOrder order = new RestaurantOrder(5);
        Drink a1 = new Drink("Pivo", 234.d, "qwe");
        Drink a2 = new Drink("Vodka", 123.2, "qewds");
        Drink a3 = new Drink("Wino", 534.2, "asdq");
        Drink a4 = new Drink("Tequila", 123.3, "qweqwx");


        System.out.println(order.add(a1));
        System.out.println(order.add(a2));
        System.out.println(order.add(a3));
        System.out.println(order.add(a4));

        System.out.println(order.costTotal());

    }
}
