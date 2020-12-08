package com.mirea.work_12.task_4;

public class Phone {

    static String transformNumber(String number) {
        if (number.isEmpty())
            return null;
        if (number.charAt(0) == '8'){
            number = number.replaceFirst("8", "+7");

        }
        String region = number.substring(1, number.length()-10);
        String tenNumbers = number.substring(number.length() - 10, number.length());


        return new StringBuffer().append("+").append(region).
                append(tenNumbers.substring(0,3)).append("-").
                append(tenNumbers.substring(3,6)).append("-").append(tenNumbers.substring(6,10)).toString();
    }

    public static void main(String[] args) {
        String number1 = "+79175655655";
        String number2 = "89175655655";
        String number3 = "+104289652211";
        System.out.println(Phone.transformNumber(number1));
        System.out.println(Phone.transformNumber(number2));
        System.out.println(Phone.transformNumber(number3));

        String number4 = "";
    }
}
