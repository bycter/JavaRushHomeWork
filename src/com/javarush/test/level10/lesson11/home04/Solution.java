package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution {

    public static void main(String[] args) {

        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] characters = s.toCharArray();

        for (int j = 0; j < 40; j++) {
            for (int i = j; i < characters.length; i++) {
                System.out.print(characters[i]);
            }
            System.out.println();
        }
    }
}
