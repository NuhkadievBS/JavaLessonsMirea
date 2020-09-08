package com.mirea.work_5;


public class RecursionTask {

    public static void one_to_n(int n) {
        // № 2
        // Вывод чисел от 1 до N
        if (n >= 1) {
            one_to_n(n - 1);
            System.out.println(n);
        }

    }

    public static int digitSum(int n) {
        // № 5
        // Возвращает сумму цифр числа
        if (n != 0) {
            return digitSum(n / 10) + n % 10;
        }
        return n;
    }

    public static void a_to_b(int a, int b) {
        // № 3
        //выводит числа от а до b, если а < b, то в порядке возрастания, иначе в порядке убывания
        if (a == b) {
            System.out.println(a);
        } else {
            if (a < b) {
                System.out.println(a);
                a_to_b(a + 1, b);
            } else {
                System.out.println(a);
                a_to_b(a - 1, b);
            }
        }
    }

    public static boolean prime(int n, int i) {
        // № 6
        // i должно по умолчанию быть равно 2
        if (i > n / 2)
            return true;
        if (n % i != 0) {
            return prime(n, i + 1);
        } else return false;
    }

    public static void primeDenominator(int n, int i) {
        // № 7
        // i по умолчанию равно 2
        if (n >= i) {
            if (n % i == 0) {
                System.out.println(i);
                primeDenominator(n / i, i);
            } else {
                primeDenominator(n, i + 1);
            }
        }

    }

    public static int razrCount(int n) {
        // метод для подсчета количества разрядов с помощью цикла
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int checkSum(int current, int d) {
        // № 4
        // Изначально значение current = pow(10, k - 1)
        // d - сумма цифр, данная в условии
        int digitCount = 0;
        int tmp = current;
        while (tmp != 0) {
            digitCount += tmp % 10;
            tmp /= 10;
        }

        if (razrCount(current) < razrCount(current + 1)) {
            if (digitCount == d)
                return 1;
            else return 0;
        }
        if (digitCount == d) {
            return checkSum(current + 1, d) + 1;
        } else return checkSum(current + 1, d);

    }

}
