package com.javarush.test.level04.lesson13.task02;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int heightMax = Integer.parseInt(reader.readLine());
        int lengthMax = Integer.parseInt(reader.readLine());

        for (int i = 0; i < heightMax; i++) {
            for (int j = 0; j < lengthMax; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
