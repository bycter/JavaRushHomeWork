package com.javarush.test.level07.lesson04.task02;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayString = new String[10];

        for (int i = 0; i < arrayString.length - 2; i++) {
            arrayString[i] = reader.readLine();
        }

        for (int j = 0; j < arrayString.length; j++) {
            System.out.println(arrayString[arrayString.length - 1 - j]);
        }
    }
}