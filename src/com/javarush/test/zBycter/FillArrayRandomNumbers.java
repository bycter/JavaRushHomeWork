package com.javarush.test.zBycter;

import java.util.concurrent.ThreadLocalRandom;

public class FillArrayRandomNumbers {

    private int[] arrayInt;
    private int minRandom, maxRandom;
    private final int minRandomDefault = 0, maxRandomDefault = 100;

    public FillArrayRandomNumbers(Integer arraySize) {

        this.arrayInt = new int[arraySize];
        this.minRandom = this.minRandomDefault;
        this.maxRandom = this.maxRandomDefault;
    }

    public FillArrayRandomNumbers(Integer arraySize, int minRandom, int maxRandom) {

        this.arrayInt = new int[arraySize];
        this.minRandom = minRandom;
        this.maxRandom = maxRandom;
    }

    public int[] fillArrayRandNum() {

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
        }
        return arrayInt;
    }

    public int[] fillArrayRandNum(Integer min, Integer max) {

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        return arrayInt;
    }

    public void printArray() {

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
