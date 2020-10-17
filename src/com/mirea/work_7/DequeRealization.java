package com.mirea.work_7;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DequeRealization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstHand = new ArrayDeque<>(5);
        ArrayDeque<Integer> secondHand = new ArrayDeque<>(5);

        for (int i = 0; i < 5; i++) {
            firstHand.addLast(scanner.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            secondHand.addLast(scanner.nextInt());
        }


        int count = 0;
        while (count < 106  && !firstHand.isEmpty() && !secondHand.isEmpty()) {
            Integer val1 = firstHand.poll();
            Integer val2 = secondHand.poll();
            int comp = val1.compareTo(val2);
            if (val1 == 9 && val2 == 0) {
                comp = -1;
            }
            if (val2 == 9 && val1 == 0) {
                comp = 1;
            }

            if (comp == 1) {
                firstHand.addLast(val1);
                firstHand.addLast(val2);
            }
            else if(comp == -1) {
                secondHand.addLast(val2);
                secondHand.addLast(val1);
            }

            count++;
        }
        if(count == 106)
            System.out.println("botva");
        else if(firstHand.isEmpty()) {
            System.out.println("second " + count);
        }
        else {
            System.out.println("first " + count);
        }

    }


}
