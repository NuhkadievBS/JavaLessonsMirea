package com.mirea.work_7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.Stack;

public class StackRealization {
    public static void main(String[] args) {
        //Реализация алгоритма на всех структурах аналогична: Если в первой колоде верхний элемент больше,
        // то оба элемента идут в начало первой колоды

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> firstHand = new Stack<>();
        Stack<Integer> secondHand = new Stack<>();

        for(int i = 0; i < 5; i++) {
            firstHand.push(scanner.nextInt());
        }
        for(int i = 0; i < 5; i++) {
            secondHand.push(scanner.nextInt());
        }

        int count = 0; // Счетчик ходов

        // Пока кол-во ходов меньше 106 и ни одна из колод не пустая
        while (count < 106  && !firstHand.isEmpty() && !secondHand.isEmpty()) {
            Integer val1 = firstHand.pop();
            Integer val2 = secondHand.pop();
            int comp = val1.compareTo(val2);
            if (val1 == 9 && val2 == 0) {
                comp = -1;
            }
            if (val2 == 9 && val1 == 0) {
                comp = 1;
            }

            if (comp == 1) {
                firstHand.add(0, val1);
                firstHand.add(0, val2);
            }
            else if(comp == -1) {
                secondHand.add(0, val2);
                secondHand.add(0, val1);
            }
            printOut(firstHand);
            printOut(secondHand);
            System.out.println('\n');
            count++;
        }

        // Выигрывает тот игрок, чья колода НЕ пустая
        if(count == 106) // Если кол-во ходов достигло 106, то выводим botva
            System.out.println("botva");
        else if(firstHand.isEmpty()) {
            System.out.println("second " + count);
        }
        else {
            System.out.println("first " + count);
        }
    }

    private static void printOut(Stack<Integer> hand) {
        String res = "[ ";
        for(Object x: hand)
            res += x.toString() + ", ";
        res = res.substring(0, res.length() - 2);
        System.out.println(res + " ]");

    }
}
