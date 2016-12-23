package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int multiplierMax = 10;
        int numberMax = 10;

        int number = 0;
        while (number < numberMax) {

            int multiplier = 0;
            while (multiplier < multiplierMax) {
                System.out.print((number + 1) * (multiplier + 1));
                System.out.print(" ");
                multiplier++;
            }
            System.out.print("\n");
            number++;
        }

    }
}
