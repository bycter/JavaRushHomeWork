package com.javarush.test.zBycter;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FillListRandomItems {

    private int minRandom, maxRandom;
    private final int minRandomDefault = 0, maxRandomDefault = 100;

    public FillListRandomItems() {

        this.minRandom = this.minRandomDefault;
        this.maxRandom = this.maxRandomDefault;
    }

    public FillListRandomItems(int minRandom, int maxRandom) {

        this.minRandom = minRandom;
        this.maxRandom = maxRandom;
    }

    public ArrayList<Integer> fillArrayListRandNum(Integer listSize) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            integerArrayList.add(ThreadLocalRandom.current().nextInt(minRandom, maxRandom));
        }
        return integerArrayList;
    }

    public ArrayList<Integer> fillArrayListRandNum(Integer listSize, Integer min, Integer max) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            integerArrayList.add(ThreadLocalRandom.current().nextInt(min, max));
        }
        return integerArrayList;
    }

    public ArrayList<String> fillArrayListRandStrings(String lang, Integer listSize, Integer stringSize) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {

            stringArrayList.add(randomString(lang, stringSize));
        }
        return stringArrayList;
    }

    /**
        Метод используется для генерации строки заданной длины случайных символов.
        Поддержка 2-х раскладок: английская, русская

        @param lang String - язык символов (eng(default), rus),
        @param stringSize Integer - длина строки
    */
    public String randomString(String lang, Integer stringSize) {

        String SALTCHARS_ENG = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String SALTCHARS_RUS = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ1234567890";

        String SALTCHARS = SALTCHARS_ENG;
        if (lang.equals("rus")) SALTCHARS = SALTCHARS_RUS;

        StringBuilder salt = new StringBuilder();
        while (salt.length() < stringSize) {
            float temp = ThreadLocalRandom.current().nextFloat();
            int index = (int) (temp * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();
    }

    public int getMinRandom() {

        return minRandom;
    }

    public void setMinRandom(int minRandom) {

        this.minRandom = minRandom;
    }

    public int getMaxRandom() {

        return maxRandom;
    }

    public void setMaxRandom(int maxRandom) {

        this.maxRandom = maxRandom;
    }
}
