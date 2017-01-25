package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        ArrayList<Character> characters = new ArrayList<>();

        ArrayList<Character> vowelsChar = new ArrayList<>();
        ArrayList<Character> otherChar = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
//        String s = "Мама мыла раму.";

        for (Character ch : s.toCharArray()) {
            characters.add(ch);
        }

        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext()) {
            Character c = iterator.next();
            if (c == ' ') iterator.remove();
        }

        for (Character character : characters) {
            if (isVowel(character)) {
                vowelsChar.add(character);
            } else {
                otherChar.add(character);
            }
        }

        for (Character character : vowelsChar) {
            System.out.print(character + " ");
        }
        System.out.println("");

        for (Character character : otherChar) {
            System.out.print(character + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {

        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
