package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrayInt = new int[20];
        int[] arrayIntPart1 = new int[10];
        int[] arrayIntPart2 = new int[10];

//        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arrayInt.length; i++) {
            if (i < 10) arrayIntPart1[i] = arrayInt[i];
            else arrayIntPart2[i - 10] = arrayInt[i];
        }

        for (Integer item : arrayIntPart2) {

            System.out.println(item);
        }
    }
}
