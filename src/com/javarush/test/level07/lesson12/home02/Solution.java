package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> stringArrayList = new ArrayList<>();

        int countOfStrings_N = Integer.parseInt(reader.readLine());
        int countOfStringsToEnd_M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < countOfStrings_N; i++) {
            stringArrayList.add(reader.readLine());
        }

        for (int j = 0; j < countOfStringsToEnd_M; j++) {
            stringArrayList.add(stringArrayList.get(0));
            stringArrayList.remove(0);
        }

        for (String s : stringArrayList) {
            System.out.println(s);
        }
    }
}
