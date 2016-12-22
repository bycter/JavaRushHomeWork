package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        boolean accept = true;
        Integer a = 0;
        Integer b = 0;
        Integer c = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
            c = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            accept = false;
        } catch (IOException e) {
            e.printStackTrace();
            accept = false;
        }

        Integer maxNumber = 1000000;

        if (a <= 0 || b <= 0 || c <= 0) accept = false;
        if (a > maxNumber || b > maxNumber || c > maxNumber) accept = false;

        if (accept) {
            if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
                System.out.println("Треугольник не существует.");
            } else {
                System.out.println("Треугольник существует.");
            }
        } else {
            System.out.println("Операция не может быть выполнена, не верные параметры.");
        }

    }
}