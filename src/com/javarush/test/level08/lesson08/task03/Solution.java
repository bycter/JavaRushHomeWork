package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = createMap();

    }

    public static HashMap<String, String> createMap() {

        HashMap<String, String> stringHashMap = new HashMap<>();

        stringHashMap.put("Петлицкий", "Александр");
        stringHashMap.put("Жигулин", "Дима");
        stringHashMap.put("Ёщик", "Денис");
        stringHashMap.put("Коледа", "Татьяна");
        stringHashMap.put("Дергачев", "Денис");
        stringHashMap.put("Попкова", "Анна");
        stringHashMap.put("Киросирова", "Мария");
        stringHashMap.put("Омельченко", "Анна");
        stringHashMap.put("Крекотень", "Нина");
        stringHashMap.put("Малиновская", "Валентина");

        return stringHashMap;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {

        int counter = 0;

        for (String s : map.values()) {
            if (s.equals(name)) {
                counter++;
            }
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int counter = 0;

        for (String s : map.keySet()) {
            if (s.equals(lastName)) {
                counter++;
            }
        }
        return counter;
    }
}
