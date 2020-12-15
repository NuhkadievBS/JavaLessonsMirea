package com.mirea.work_16.orders;

import com.mirea.work_16.Customer;
import com.mirea.work_16.items.Item;

public interface Order {
    boolean add(Item item); // добавление позиции
    boolean remove(String itemName); // удаление позиции по названию
    int removeAll(String itemName); // удаление всех позиций в заказе
    int itemQuantity(Item itemName);  // возвращает общее число позиций в заказе
    int itemQuantity(String itemName); // возвращает число позиций по названию
    Item[] getItems(); // возвращает массив заказанных позиций
    double costTotal(); // возвращает общую стоимость заказа
    String[] itemNames(); // возвращает массив названий заказанных блюд (без повторений)
    Item[] sortedItemsByCostDesc(); // возвращает массив позиций заказа в порядке убывания цены
    Customer getCustomer();
    void setCustomer(Customer customer);
}
