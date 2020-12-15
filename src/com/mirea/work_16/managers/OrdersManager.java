package com.mirea.work_16.managers;

import com.mirea.work_16.items.Item;
import com.mirea.work_16.orders.Order;

public interface OrdersManager {
    int itemsQuantity(String itemName);
    int itemsQuantity(Item itemName);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
    void remove(Order order);
}
