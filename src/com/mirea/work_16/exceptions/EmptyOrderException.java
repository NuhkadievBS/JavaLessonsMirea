package com.mirea.work_16.exceptions;

import javax.swing.*;

public class EmptyOrderException extends Exception{
    public EmptyOrderException(){
        JOptionPane.showMessageDialog(null,"Ваш заказ пуст. Добавьте предметы","Your Order is Empty",JOptionPane.ERROR_MESSAGE);
    }
}
