package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");

        String insert = "именно";
        int arraySize = arrayList.size();
        for (int i = 0; i < arraySize; i++) {
            arrayList.add(i * 2 + 1, insert);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }

    }
}
