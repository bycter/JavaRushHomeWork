package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer a = Integer.parseInt(reader.readLine());
        Integer b = Integer.parseInt(reader.readLine());
        Integer c = Integer.parseInt(reader.readLine());
        Integer d = Integer.parseInt(reader.readLine());
        Integer max1, max2;

        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }
        if (c > d) {
            max2 = c;
        } else {
            max2 = d;
        }
        if (max1 > max2) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }
    }
}
