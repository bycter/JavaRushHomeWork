package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char anAbcArray : abcArray) {
            alphabet.add(anAbcArray);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

//        FillListRandomItems listRandomItems = new FillListRandomItems();
//        list = listRandomItems.fillArrayListRandStrings("rus", 10, 15);
//        for (String s : list) {
//            System.out.println(s);
//        }

        ArrayList<Integer> alhabetCounter = new ArrayList<>(alphabet.size());

        for (int i = 0; i < alphabet.size(); i++) {
            int counterOfLetters = 0;
            for (String aList : list) {
                char[] stringCharArray = aList.toCharArray();

                for (char c : stringCharArray) {
                    if (alphabet.get(i).equals(c)) counterOfLetters++;
                }
            }
            alhabetCounter.add(i, counterOfLetters);
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + alhabetCounter.get(i));
        }
    }

}
