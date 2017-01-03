package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }

        for (int j = 0; j < 13; j++) {
            arrayList.add(0, arrayList.get(arrayList.size() - 1));
            arrayList.remove(arrayList.size() - 1);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
