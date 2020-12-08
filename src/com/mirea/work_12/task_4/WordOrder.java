package com.mirea.work_12.task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordOrder {
    public static void main(String[] args) {

        // Киев Нью-Йорк Амстердам Вена Мельбурн
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        System.out.println(getLine(words).toString());
    }
    public static StringBuilder getLine(String... words) {
        if (words == null || words.length == 0)
        { return new StringBuilder(); }
        if ("".equals(words[0]) || words.length == 1)
        {return new StringBuilder(words[0]); }

        StringBuilder result = new StringBuilder();

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i ++)
            if (!words[i].equals(""))
                list.add(words[i]);
        while (!checker(list))
        {
            Collections.shuffle(list);
        }
        for (String s : list)
            result.append(s+ " ");
        result.deleteCharAt(result.length()-1);
        return result;
    }
    public static boolean checker(ArrayList<String> list)
    {
        for (int i = 0; i < list.size()-1; i++)
        {
            String first = list.get(i);
            String second = list.get(i+1);
            first = first.toLowerCase();
            second =second.toLowerCase();
            if (first.charAt(first.length()-1)!=second.charAt(0))
                return false;
        }
        return true;
    }
}