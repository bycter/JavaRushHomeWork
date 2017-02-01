package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {

    public static void main(String[] args) {

        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList<String>[] arrayLists = new ArrayList[10];

         for (int i =0; i < arrayLists.length; i++) {
            arrayLists[i] = new ArrayList<>();
            arrayLists[i].add(randomString(15));
        }
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {

        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    public static String randomString(Integer stringSize) {

        String SALTCHARS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ1234567890";

        StringBuilder salt = new StringBuilder();
        while (salt.length() < stringSize) {
            float temp = ThreadLocalRandom.current().nextFloat();
            int index = (int) (temp * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();
    }
}