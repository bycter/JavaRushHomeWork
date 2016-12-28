package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {

    private String name;
    private int height;
    private String color;

    //    - Имя
    public Dog(String name) {
        this.name = name;
    }

    //    - Имя, рост
    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    //    - Имя, рост, цвет
    public Dog(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
