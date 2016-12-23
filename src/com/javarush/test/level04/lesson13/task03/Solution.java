package com.javarush.test.level04.lesson13.task03;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int heightMax = 10;
        int lengthMax = 10;

        int length = 1;
        for (int i = 0; i < heightMax; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("8");
            }
            if (length <= lengthMax) {
                length++;
            }
            System.out.println("");
        }
    }
}
