package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

//        FillArrayRandomItems fillArrayRandomNumbers = new FillArrayRandomItems(20, -150, 5);
//        int[] array = fillArrayRandomNumbers.fillArrayRandNum();
//
//        fillArrayRandomNumbers.printArray();
//        System.out.println(" ");

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {

        Integer[] arrayInt = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInt[i] = array[i];
        }

        Arrays.sort(arrayInt, Collections.reverseOrder());


        for (int i = 0; i < arrayInt.length; i++) {
            array[i] = arrayInt[i];
        }
    }
}
