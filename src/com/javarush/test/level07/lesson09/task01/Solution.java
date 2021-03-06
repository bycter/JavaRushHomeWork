package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        int arrayLengthInput = 20;
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListDiv3 = new ArrayList<>();
        ArrayList<Integer> arrayListDiv2 = new ArrayList<>();
        ArrayList<Integer> arrayListOther = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrayLengthInput; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer integer : arrayList) {
            if ((integer % 2 == 0) || (integer % 3 == 0)) {
                if (integer % 3 == 0) arrayListDiv3.add(integer);
                if (integer % 2 == 0) arrayListDiv2.add(integer);
            } else {
                arrayListOther.add(integer);
            }
        }

        printList(arrayListDiv3);
        printList(arrayListDiv2);
        printList(arrayListOther);
    }

    public static void printList(List<Integer> list) {

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
