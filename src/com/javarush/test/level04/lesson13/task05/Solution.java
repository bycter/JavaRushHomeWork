package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        int counter = 10;
        for (int i = 0; i < counter; i++) {
            System.out.println(s + " любит меня.");
        }
    }
}
