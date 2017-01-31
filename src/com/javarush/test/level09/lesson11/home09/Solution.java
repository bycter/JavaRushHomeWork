package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution {

    public static void main(String[] args) {

        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {

        Map<String, Cat> stringCatMap = new HashMap<>();

        String[] names = {"Tom", "Jerry", "Tima", "Marsik", "Gosha", "Kysia", "Myrka", "Baksik", "Vasilii", "Matroskin"};

        for (String name : names) {
            stringCatMap.put(name, new Cat(name));
        }

        return stringCatMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cats = new HashSet<>();

        for (Cat cat : map.values()) {
            cats.add(cat);
        }

        return cats;
    }

    public static void printCatSet(Set<Cat> set) {

        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {

        private String name;

        public Cat(String name) {

            this.name = name;
        }

        public String toString() {

            return "Cat " + this.name;
        }
    }


}