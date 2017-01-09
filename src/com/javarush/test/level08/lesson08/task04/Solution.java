package com.javarush.test.level08.lesson08.task04;

import javafx.scene.input.InputMethodTextRun;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Denis", new Date("APRIL 241 1989"));
        map.put("Vasia", new Date("JUNE 1 1980"));
        map.put("Ann", new Date("DECEMBER 6 1989"));
        map.put("Tanya", new Date("JANUARY 7 1990"));
        map.put("Dima", new Date("MAY 14 1980"));
        map.put("Valentina", new Date("MAY 18 1980"));
        map.put("Boris", new Date("AUGUST 10 1980"));
        map.put("Nina", new Date("JANUARY 8 1980"));
        map.put("Masha", new Date("FEBRUARY 23 1980"));
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for (Date date : map.values()) {
            date.compareTo(new Date(new Month("JUNE")));
        }

    }
}
