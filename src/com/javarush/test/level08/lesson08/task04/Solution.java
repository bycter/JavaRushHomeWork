package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {

//    public static void main(String[] args) throws Throwable {
//
//        HashMap<String, Date> hashMap = createMap();
//
//        for (Map.Entry<String, Date> stringDateEntry : hashMap.entrySet()) {
//
//            System.out.println(stringDateEntry.getKey().toString() + " (" + stringDateEntry.getValue().getMonth() + ")");
//        }
//
//        removeAllSummerPeople(hashMap);
//
//        System.out.println(" ");
//        for (Map.Entry<String, Date> stringDateEntry : hashMap.entrySet()) {
//
//            System.out.println(stringDateEntry.getKey().toString() + " (" + stringDateEntry.getValue() + ")");
//        }
//    }

    public static HashMap<String, Date> createMap() {

        HashMap<String, Date> map = new HashMap<>();
        map.put("Tanya", new Date("JANUARY 7 1990"));   //
        map.put("Denis", new Date("FEBRUARY 24 1989"));    //
        map.put("Chris", new Date("MARCH 4 1951"));     //
        map.put("Martin", new Date("APRIL 16 1965"));   //
        map.put("Jeckie", new Date("MAY 7 1954"));    //
        map.put("Stallone", new Date("JUNE 1 1980"));   // s
        map.put("Dima", new Date("JULY 22 1992"));      // s    r
        map.put("Galina", new Date("AUGUST 11 1962"));  // s    r
        map.put("Masha", new Date("SEPTEMBER 23 1990"));//      r
        map.put("Ann", new Date("DECEMBER 6 1989"));    //

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();

            if (pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7) {
                iterator.remove();
            }
        }
    }
}
