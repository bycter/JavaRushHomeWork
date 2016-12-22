package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        boolean flagDone = false;

        int max = 0, mid = 0, min = 0;

        if (a >= maxValue(b, c))
        {
            max = a;
            if (b >= c)
            {
                mid = b;
                min = c;
            } else
            {
                mid = c;
                min = b;
            }
            flagDone = true;
        }

        if (b >= maxValue(a, c) && !flagDone)
        {
            max = b;
            if (a >= c)
            {
                mid = a;
                min = c;
            } else
            {
                mid = c;
                min = a;
            }
            flagDone = true;
        }

        if (c >= maxValue(b, a) && !flagDone)
        {
            max = c;
            if (b >= a)
            {
                mid = b;
                min = a;
            } else
            {
                mid = a;
                min = b;
            }
        }

        System.out.println(max + " " + mid + " " + min);
    }

    public static int maxValue(int num1, int num2)
    {
        if (num1 > num2)
        {
            return num1;
        } else
        {
            return num2;
        }
    }
}
