package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

//        FillListRandomItems listRandomItems = new FillListRandomItems();
//        for (int i = 0; i < 20; i++) {
//            array[i] = listRandomItems.randomString("rus", 5);
//            System.out.println(array[i]);
//        }
//        System.out.println(" ");

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String temp; // временная переменная для хранения значения элемента сортируемого массива
        int item; // индекс предыдущего элемента

        for (int counter = 1; counter < array.length; counter++) {
            temp = array[counter]; // инициализируем временную переменную текущим значением элемента массива
            item = counter - 1; // запоминаем индекс предыдущего элемента массива
            while (item >= 0 && isGreaterThan(array[item], temp))
            {
                array[item + 1] = array[item]; // перестановка элементов массива
                array[item] = temp;
                item--;
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {

        return a.compareTo(b) > 0;
    }
}
