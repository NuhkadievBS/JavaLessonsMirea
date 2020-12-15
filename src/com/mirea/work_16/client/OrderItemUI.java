package com.mirea.work_16.client;

import com.mirea.work_16.items.Item;
import com.mirea.work_16.orders.Order;

import javax.swing.*;
import java.awt.*;

public class OrderItemUI {
    JLabel name;
    JLabel cost;
    JLabel count;
    JLabel totalCost;
    JPanel itemPanel=new JPanel();

    OrderItemUI(Item menuItem, JPanel panel, Order order, int i){
        itemPanel.setLayout(new GridBagLayout());
        GridBagConstraints nameConstraints=new GridBagConstraints();
        nameConstraints.weightx=1.0f;
        nameConstraints.weighty=0.05;
        nameConstraints.anchor=GridBagConstraints.NORTHWEST;
        nameConstraints.gridx=0;
        nameConstraints.gridy=0;
        name=new JLabel("Наименование: "+menuItem.getName());
        itemPanel.add(name,nameConstraints);
        nameConstraints.gridy=1;
        cost=new JLabel("Стоимость: "+String.valueOf(menuItem.getCost()));
        itemPanel.add(cost,nameConstraints);
        nameConstraints.gridy=2;
        count=new JLabel("Количество: "+String.valueOf(order.itemQuantity(menuItem)));
        itemPanel.add(count,nameConstraints);
        nameConstraints.gridy=3;
        totalCost=new JLabel("Итого: "+String.valueOf(order.itemQuantity(menuItem)*menuItem.getCost()));
        nameConstraints.gridy=i;
        panel.add(itemPanel,nameConstraints);
    }
}
