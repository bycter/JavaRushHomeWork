package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arrayListSize = 20;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
//        FillListRandomNumbers fillArrayList = new FillListRandomNumbers();
//        ArrayList<Integer> integerArrayList = fillArrayList.fillArrayListRandNum(arrayListSize);
//        fillArrayList.printArrayList();

        for (int i = 0; i < arrayListSize; i++) {
            integerArrayList.add(Integer.parseInt(reader.readLine()));
        }

        int maximum;
        int minimum;

        maximum = minimum = integerArrayList.get(0);
        for (Integer integer : integerArrayList) {
            if (integer > maximum) maximum = integer;
            if (integer < minimum) minimum = integer;
        }

        System.out.println(maximum + " " + minimum);
    }


}
