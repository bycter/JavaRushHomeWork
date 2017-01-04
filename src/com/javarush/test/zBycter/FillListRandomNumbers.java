package com.javarush.test.zBycter;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FillListRandomNumbers {

    private ArrayList<Integer> arrayList;
    private int minRandom, maxRandom;
    private final int minRandomDefault = 0, maxRandomDefault = 100;

    public FillListRandomNumbers() {

        this.arrayList = new ArrayList<>();
        this.minRandom = this.minRandomDefault;
        this.maxRandom = this.maxRandomDefault;
    }

    public FillListRandomNumbers(int minRandom, int maxRandom) {

        this.arrayList = new ArrayList<>();
        this.minRandom = minRandom;
        this.maxRandom = maxRandom;
    }

    public ArrayList<Integer> fillArrayListRandNum(Integer listSize) {

        for (int i = 0; i < listSize; i++) {
            arrayList.add(ThreadLocalRandom.current().nextInt(minRandom, maxRandom));
        }
        return arrayList;
    }

    public ArrayList<Integer> fillArrayListRandNum(Integer listSize, Integer min, Integer max) {

        for (int i = 0; i < listSize; i++) {
            arrayList.add(ThreadLocalRandom.current().nextInt(min, max));
        }
        return arrayList;
    }

    public void printArrayList() {

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
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
