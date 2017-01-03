package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberCount = 5;
        ArrayList<Integer> arrayInt = new ArrayList<>();

        for (int i = 0; i < numberCount; i++) {
            arrayInt.add(Integer.parseInt((reader.readLine())));
        }

        ArrayList<Integer> arrayResult = insertionSort(arrayInt);

        for (Integer item : arrayResult) {
            System.out.println(item);
        }
    }

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> array) // сортировка вставками
    {

        int temp; // временная переменная для хранения значения элемента сортируемого массива
        int item; // индекс предыдущего элемента

        for (int counter = 1; counter < array.size(); counter++) {
            temp = array.get(counter); // инициализируем временную переменную текущим значением элемента массива
            item = counter - 1; // запоминаем индекс предыдущего элемента массива
            while (item >= 0 && array.get(item) > temp) // пока индекс не равен 0 и предыдущий элемент массива больше текущего
            {
                array.add(item, temp); // перестановка элементов массива
                array.remove(item + 2);
                item--;
            }
        }
        return array;
    }

}
