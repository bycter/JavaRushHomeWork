package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution {

    public static void main(String[] args) {

        readData();
    }

    public static void readData() {

        ArrayList<Integer> integers = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                integers.add(Integer.parseInt(reader.readLine()));
            } catch (NumberFormatException e) {
                break;
            } catch (IOException e) {
                /* I don't know what I need to write here. */
            }
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
