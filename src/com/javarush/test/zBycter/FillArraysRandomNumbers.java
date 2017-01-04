package com.javarush.test.zBycter;

import java.util.concurrent.ThreadLocalRandom;

public class FillArraysRandomNumbers {

    private int[] arrayInt;
    private int minRandom, maxRandom;
    private final int minRandomDefault = 0, maxRandomDefault = 100;

    public FillArraysRandomNumbers(Integer arraySize) {

        this.arrayInt = new int[arraySize];
        this.minRandom = this.minRandomDefault;
        this.maxRandom = this.maxRandomDefault;
    }

    public FillArraysRandomNumbers(Integer arraySize, int minRandom, int maxRandom) {

        this.arrayInt = new int[arraySize];
        this.minRandom = minRandom;
        this.maxRandom = maxRandom;
    }

    public int[] fillArrayListRandNum() {

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
        }
        return arrayInt;
    }

    public int[] fillArrayListRandomNumbers(Integer min, Integer max) {

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        return arrayInt;
    }

    public void printArrayList() {

        for (Integer integer : arrayInt) {
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
