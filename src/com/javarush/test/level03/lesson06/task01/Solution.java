package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String w1 = "Мама", w2 = "Мыла", w3 = "Раму";

        System.out.println(w1 + w2 + w3);
        System.out.println(w1 + w3 + w2);
        System.out.println(w2 + w1 + w3);
        System.out.println(w2 + w3 + w1);
        System.out.println(w3 + w1 + w2);
        System.out.println(w3 + w2 + w1);

    }
}