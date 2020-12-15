package com.mirea.work_16.client;

import com.mirea.work_16.managers.InternetOrdersManager;
import com.mirea.work_16.managers.TableOrderManager;

import javax.swing.*;
import java.awt.*;

public class RestaurantUI extends JFrame {

    JMenuBar jMenuBar=new JMenuBar();
    JMenu jMode=new JMenu("Режим");
    JMenuItem clientMode=new JMenuItem("Режим клиента");
    JMenuItem waiterMode=new JMenuItem("Режим официанта");
    public RestaurantUI() {
        setSize(1280, 720);
        setLocation((1920 - 1280) / 2, (1080 - 720) / 2);
        setLayout(new GridBagLayout());
        jMode.add(clientMode);
        jMode.add(waiterMode);
        jMenuBar.add(jMode);
        GridBagConstraints jMenuBarConstraints= new GridBagConstraints();
        jMenuBarConstraints.fill=GridBagConstraints.HORIZONTAL;
        jMenuBarConstraints.weightx=1.0f;
        jMenuBarConstraints.weighty=0.05;
        jMenuBarConstraints.anchor=GridBagConstraints.NORTHWEST;
        jMenuBarConstraints.gridx=0;
        jMenuBarConstraints.gridy=0;
        add(jMenuBar,jMenuBarConstraints);
        setVisible(true);
        clientMode.addActionListener(e -> {
            setVisible(false);
            new ClientUI(new TableOrderManager(),new InternetOrdersManager());
        });
        waiterMode.addActionListener(e -> {
            setVisible(false);
            new WaiterUI(new TableOrderManager(),new InternetOrdersManager());
        });
    }

    public static void main(String[] args){
        new RestaurantUI();
    }

}
