package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int arrayLengthInput = 5;
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrayLengthInput; i++) {
            arrayList.add(reader.readLine());
        }

        arrayList.remove(2);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(arrayList.size() - 1 - i));
        }
    }
}
