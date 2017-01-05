package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {

    public static HashSet<Integer> createSet() {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            hashSet.add(ThreadLocalRandom.current().nextInt(0, 50));
        }

        return hashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {

        Iterator<Integer> iterator = set.iterator();
        for (; iterator.hasNext(); ) {
            Integer integer = iterator.next();
            if (integer > 10) {
                iterator.remove();
            }
        }
        return set;
    }
}
