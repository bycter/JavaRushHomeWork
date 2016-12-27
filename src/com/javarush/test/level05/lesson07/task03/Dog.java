package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    protected String name;
    protected int height;
    protected String color;

    // - Имя
    public void initialize(String name) {
        this.name = name;
    }

    // - Имя, рост
    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // - Имя, рост, цвет
    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
