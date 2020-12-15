package com.mirea.work_16.client;

import com.mirea.work_16.items.Item;
import com.mirea.work_16.managers.OrdersManager;
import com.mirea.work_16.orders.Order;

import javax.swing.*;
import java.awt.*;

public class OrderUI {
    JLabel costs;
    JLabel type;
    JLabel customer;
    JPanel orderPanel;
    JPanel jPanel;
    JButton jButton=new JButton("Посмотреть заказ");
    JButton cancelButton=new JButton("Выдать заказ");
    OrdersManager ordersManager;
    Order order;
    WaiterUI waiterUI;
    OrderUI(Order order, JPanel jPanel,int i,OrdersManager ordersManager,WaiterUI waiterUI){
        this.jPanel=jPanel;
        this.order=order;
        this.waiterUI=waiterUI;
        orderPanel=new JPanel(new GridBagLayout());
        costs=new JLabel("Стоимость: "+String.valueOf(order.costTotal()));
        if(order.getCustomer()==null)type=new JLabel("В ресторане");
        else{
            type=new JLabel("Доставка");
        }
        GridBagConstraints nameConstraints=new GridBagConstraints();
        nameConstraints.weightx=1.0f;
        nameConstraints.weighty=0.05;
        nameConstraints.anchor=GridBagConstraints.NORTHWEST;
        nameConstraints.gridx=0;
        nameConstraints.gridy=0;
        nameConstraints.gridy=0;
        orderPanel.add(costs,nameConstraints);
        nameConstraints.gridy=1;
        orderPanel.add(type,nameConstraints);
        nameConstraints.fill=GridBagConstraints.BOTH;
        nameConstraints.weighty=1;
        nameConstraints.weightx=1;
        nameConstraints.gridx=1;
        nameConstraints.gridy=0;
        nameConstraints.gridheight=GridBagConstraints.REMAINDER;
        nameConstraints.gridwidth=GridBagConstraints.REMAINDER;
        orderPanel.add(jButton,nameConstraints);
        nameConstraints=new GridBagConstraints();
        nameConstraints.fill=GridBagConstraints.NONE;
        nameConstraints.weightx=1.0f;
        //nameConstraints.weighty=0.01f;
        nameConstraints.anchor=GridBagConstraints.WEST;
        nameConstraints.gridx=0;
        nameConstraints.gridy=2;

        if(order.getCustomer()!=null){
            customer=new JLabel("Заказчик: "+order.getCustomer().getFirstName()+" "+order.getCustomer().getSecondName());
            orderPanel.add(customer,nameConstraints);
        }
        nameConstraints.gridy=i;
        nameConstraints.insets.top=10;
        nameConstraints.insets.bottom=10;
        jPanel.add(orderPanel,nameConstraints);

        jButton.addActionListener(e-> LookAtOrder());

        this.ordersManager=ordersManager;
    }

    private void LookAtOrder(){

        JFrame window=new JFrame("Order");
        window.setSize(1280, 720);
        window.setLocation((1920 - 1280) / 2, (1080 - 720) / 2);
        JPanel menuItemsPanel=new JPanel();
        JPanel buttonsPanel=new JPanel();
        window.setLayout(new GridBagLayout());
        buttonsPanel.setLayout(new GridLayout(6,1));

        buttonsPanel.add(costs);
        GridBagConstraints textFieldsConstraint= new GridBagConstraints();
        textFieldsConstraint.fill=GridBagConstraints.BOTH;
        textFieldsConstraint.weightx=0.5f;
        textFieldsConstraint.weighty=1f;
        textFieldsConstraint.anchor=GridBagConstraints.SOUTHWEST;
        textFieldsConstraint.gridx=0;
        textFieldsConstraint.gridy=1;
        JScrollPane menuPane=new JScrollPane(menuItemsPanel);
        window.add(menuPane,textFieldsConstraint);
        textFieldsConstraint.gridx=1;
        window.add(buttonsPanel,textFieldsConstraint);

        menuItemsPanel.setLayout(new GridBagLayout());
        int i=0;
        Item[] menuItems=order.getItems();
        for(Item menuItem:menuItems) {
            new OrderItemUI(menuItem, menuItemsPanel,order,i);
            i++;
        }


        cancelButton.addActionListener(e->{
            ordersManager.remove(order);
            window.setVisible(false);
            waiterUI.costs.setText("Стоимость заказов, ожидающих выдачи: "+String.valueOf(waiterUI.tableOrdersManager.ordersCostSummary()+waiterUI.internetOrdersManager.ordersCostSummary()));
            waiterUI.countLabel.setText("Количество заказов, ожидающих выдачи: "+String.valueOf(waiterUI.tableOrdersManager.getOrders().length+waiterUI.internetOrdersManager.getOrders().length));
            waiterUI.setVisible(false);
            waiterUI.setVisible(true);
            jPanel.remove(orderPanel);

        });

        costs.setText("Полная стоимость заказа: "+String.valueOf(order.costTotal()));
        buttonsPanel.add(new JLabel("Количество элементов в заказе: "+String.valueOf(order.getItems().length)));
        if(order.getCustomer()!=null){
            buttonsPanel.add(new JLabel("Доставка"));
            buttonsPanel.add(new JLabel("Заказчик: "+order.getCustomer().getFirstName()+" "+order.getCustomer().getSecondName()));
            buttonsPanel.add(new JLabel(String.format("Адрес: %s, %s, %s, %s, %s, %s",order.getCustomer().getAdress().getCityName(),order.getCustomer().getAdress().getZipCode(),order.getCustomer().getAdress().getStreetName(),order.getCustomer().getAdress().getBuildingNumber(),order.getCustomer().getAdress().getBuildingLetter(),order.getCustomer().getAdress().getApartamentNumber())));
        }else buttonsPanel.add(new JLabel("В ресторане"));
        buttonsPanel.add(cancelButton);
        window.setVisible(true);

    }
}