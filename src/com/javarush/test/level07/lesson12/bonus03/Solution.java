package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
//        FillArrayRandomItems fillArrayRandomNumbers = new FillArrayRandomItems(10);
//        int[] array = fillArrayRandomNumbers.fillArrayRandNum(-100, 100);
//        fillArrayRandomNumbers.printArray();
//        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        int temp; // временная переменная для хранения значения элемента сортируемого массива
        int item; // индекс предыдущего элемента

        for (int counter = 1; counter < array.length; counter++) {
            temp = array[counter]; // инициализируем временную переменную текущим значением элемента массива
            item = counter - 1; // запоминаем индекс предыдущего элемента массива
            while (item >= 0 && array[item] < temp) // пока индекс не равен 0 и предыдущий элемент массива меньше текущего
            {
                array[item + 1] = array[item]; // перестановка элементов массива
                array[item] = temp;
                item--;
            }
        }
    }
}
