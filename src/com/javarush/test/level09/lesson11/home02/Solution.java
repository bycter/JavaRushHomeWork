package com.javarush.test.level09.lesson11.home02;

/* Обратный отсчёт от 10 до 0
Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
*/

public class Solution {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            /* I don't know what write to here */
            }
        }
    }
}
