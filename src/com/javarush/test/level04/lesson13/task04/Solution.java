package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int lengthGorLine = 10;
        int heightVertLine = 10;

        for (int i = 0; i < lengthGorLine; i++) {
            System.out.print("8");
        }
        System.out.println("");

        for (int j = 0; j < heightVertLine; j++) {
            System.out.println("8");
        }
    }
}
