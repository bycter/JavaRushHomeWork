package com.javarush.test.level04.lesson10.task02;

/* 10 чисел наоборот
Вывести на экран числа от 10 до 1 используя цикл while.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int counter = 0;
        int counterMax = 10;
        while (counter < counterMax) {
            System.out.println(counterMax - counter);
            counter++;
        }

    }
}
