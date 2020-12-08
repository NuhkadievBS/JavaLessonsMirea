package com.mirea.work_16;

public class TableOrderManager implements OrdersManager{
    private Order[] orders;


    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(Item item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
