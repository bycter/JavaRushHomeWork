package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

//        words = fillArray();

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {

        HashMap<String, Integer> result = new HashMap<>();

        for (String aList : list) {
            boolean wordEqual = false;
            for (Map.Entry<String, Integer> entrySet : result.entrySet()) {
                if (entrySet.getKey().equals(aList)) {
                    entrySet.setValue(entrySet.getValue() + 1);
                    wordEqual = true;
                }
            }
            if (!wordEqual) {
                result.put(aList, 1);
            }
        }
        return result;
    }

//    public static ArrayList<String> fillArray() {
//
//        ArrayList<String> words = new ArrayList<String>();
//
//        words.add("Папа");
//        words.add("Мама");
//        words.add("войлок");
//        words.add("цветок");
//        words.add("джава");
//
//        words.add("папа");
//        words.add("мама");
//        words.add("внук");
//        words.add("солнце");
//        words.add("вАлЕрА");
//
//        words.add("транЗИСТор");
//        words.add("сыН");
//        words.add("ВаЛеРа");
//        words.add("ВоЙлок");
//        words.add("СОЛНЦЕ");
//
//        words.add("паПА");
//        words.add("транзистор");
//        words.add("волк");
//        words.add("сын");
//        words.add("монитор");
//
//        return words;
//    }
}
