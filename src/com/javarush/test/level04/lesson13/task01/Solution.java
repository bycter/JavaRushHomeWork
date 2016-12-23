package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int numberMin = 1;
        int numberMax = 100;

        for (int i = numberMin; i <= numberMax; i++) {
            if ((i % 2) == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
