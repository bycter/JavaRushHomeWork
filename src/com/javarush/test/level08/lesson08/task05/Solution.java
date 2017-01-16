package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

//    public static void main(String[] args) throws Throwable {
//
//        HashMap<String, String> hashMap = createMap();
//
//        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {
//            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
//        }
//        System.out.println(" ");
//        removeTheFirstNameDuplicates(hashMap);
//
//        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {
//            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
//        }
//    }

    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<>();

        map.put("Yoshchyk", "Denis");
        map.put("Dergachev", "Denis");
        map.put("Popkova", "Anna");
        map.put("Omelchenko", "Anna");
        map.put("Kirosirova", "Masha");

        map.put("Krekoten", "Nina");
        map.put("Koleda", "Kolya");
        map.put("Sakun", "Kate");
        map.put("Pilipchik", "Kate");
        map.put("Shikulin", "Dima");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        ArrayList<String> doubleValues = new ArrayList<>();

        for (Map.Entry<String, String> s : map.entrySet()) {

            int counter = 0;

            for (Map.Entry<String, String> s1 : map.entrySet()) {
                boolean continueFlag = true;

                if (s.getKey().equals(s1.getKey())) continue;

                if (doubleValues.size() > 0) {

                    for (String doubleValue : doubleValues) {
                        if (s1.getValue().equals(doubleValue)) {
                            continueFlag = false;
                        }
                    }
                }

                if (!continueFlag) continue;

                if (s.getValue().equals(s1.getValue())) counter++;
            }
            if (counter > 0) {
                doubleValues.add(s.getValue());
            }

        }
        for (String doubleValue : doubleValues) {
            removeItemFromMapByValue(map, doubleValue);
            removeItemFromMapByValue(map, doubleValue);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
