package com.javarush.test.level08.lesson11.home09;

import java.util.Date;/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {

    public static void main(String[] args) {

//        System.out.println("JANUARY 1 2018 = " + isDateOdd("JANUARY 1 2018"));
//        System.out.println("JANUARY 2 2020 = " + isDateOdd("JANUARY 2 2020"));
//        System.out.println("February 29 2021 = " + isDateOdd("February 29 2021"));
    }

    public static boolean isDateOdd(String date) {

        Date yearStartDay = new Date(date);
        yearStartDay.setDate(0);
        yearStartDay.setMonth(0);
        yearStartDay.setHours(0);
        yearStartDay.setMinutes(0);
        yearStartDay.setSeconds(0);

        Date date1 = new Date(date);
        long msInOneDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) ((date1.getTime() - yearStartDay.getTime()) / msInOneDay);

        if ((dayCount % 2) == 0) return false;
        else return true;
    }
}
