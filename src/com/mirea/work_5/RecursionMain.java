package com.mirea.work_5;

import java.util.Scanner;

public class RecursionMain {

    public static void main(String[] args) {
        // Вариант 19
        // Тесты упражнений [2, 7]
        Scanner scanner = new Scanner(System.in);

        // Упр. 2
        System.out.println("task_2 Test");
        RecursionTask.one_to_n(scanner.nextInt());
        System.out.println();


        // Упр. 3
        System.out.println("task_3 Test");
        RecursionTask.a_to_b(scanner.nextInt(), scanner.nextInt());
        System.out.println();
        RecursionTask.a_to_b(scanner.nextInt(), scanner.nextInt());
        System.out.println();

        // Упр. 4
        System.out.println("task_4 Test");
        System.out.println(RecursionTask.checkSum((int) Math.pow(10, scanner.nextInt() - 1), scanner.nextInt()));
        System.out.println();

        // Упр. 5
        System.out.println("task_5 Test");
        System.out.println(Math.abs(RecursionTask.digitSum(scanner.nextInt())));
        System.out.println();

        // Упр. 6
        System.out.println("task_6 Test");
        if (RecursionTask.prime(scanner.nextInt(), 2))
            System.out.println("Yes");
        else System.out.println(("No"));
        System.out.println();

        // Упр. 7
        System.out.println("task_7 Test");
        RecursionTask.primeDenominator(scanner.nextInt(), 2);

    }
}
