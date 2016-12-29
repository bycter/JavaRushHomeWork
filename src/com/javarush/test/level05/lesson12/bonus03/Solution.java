package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;

        while (counter <= 0) {
            System.out.println("Enter count of numbers. Count should be > 0");
            counter = Integer.parseInt(reader.readLine());
        }

        int[] array = new int[counter];

        System.out.println("Please enter " + counter + " numbers.");
        for (int i = 0; i < array.length; i++) {

            array[i] = Integer.parseInt(reader.readLine());
            if (i < array.length) System.out.println("Enter next number.");
        }

        int maximum = 0;

        for (int j = 0; j < array.length - 1; j++) {
            maximum = array[j] > array[j + 1] ? array[j] : array[j + 1];
        }

        System.out.println(maximum);
    }
}
