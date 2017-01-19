package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

    }

    public static String method1() {
        method2();
//        for (int i = 0; i < element.length; i++) {
//            System.out.println("element[" + i + "] = " + element[i].getMethodName().toString());
//        }
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getMethodName().toString();
    }
//
    public static String method2()
    {
        method3();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getMethodName().toString();

    }

    public static String method3()
    {
        method4();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getMethodName().toString();

    }

    public static String method4()
    {
        method5();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getMethodName().toString();

    }

    public static String method5()
    {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        return element[2].getMethodName().toString();

    }
}
