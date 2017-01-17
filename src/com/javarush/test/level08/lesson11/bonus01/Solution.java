package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> nameOfMonth = new ArrayList<>();
        nameOfMonth.add("January");
        nameOfMonth.add("February");
        nameOfMonth.add("March");
        nameOfMonth.add("April");
        nameOfMonth.add("May");
        nameOfMonth.add("June");
        nameOfMonth.add("July");
        nameOfMonth.add("August");
        nameOfMonth.add("September");
        nameOfMonth.add("October");
        nameOfMonth.add("November");
        nameOfMonth.add("December");

        String chosenMonth = "";
        String inputString = reader.readLine();

        for (String s : nameOfMonth) {
            if (s.compareToIgnoreCase(inputString) == 0){
                chosenMonth = s;
            }
        }

        if (Objects.equals(chosenMonth, "")) return;

        System.out.println(chosenMonth + " is " + (nameOfMonth.indexOf(chosenMonth) + 1) + " month");
    }
}
