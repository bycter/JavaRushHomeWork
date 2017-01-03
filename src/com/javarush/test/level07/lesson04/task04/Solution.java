package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arraySize = 10;
        int[] arrayInt = new int[arraySize];
        int[] arrayResult = new int[arraySize];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(reader.readLine());
            arrayResult[arraySize - 1 - i] = arrayInt[i];
        }

        for (int anArrayResult : arrayResult) {
            System.out.println(anArrayResult);
        }
    }
}
