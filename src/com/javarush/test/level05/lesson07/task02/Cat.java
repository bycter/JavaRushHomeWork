package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String color;
    private String address;

    private int weightAverage = 4;
    private int ageAverage = 2;

    // - Имя,
    public void initialize(String name) {
        this.name = name;
        this.weight = weightAverage;
        this.age = ageAverage;
        this.address = null;
    }

    // - Имя, вес, возраст
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.address = null;
    }

    // - Имя, возраст (вес стандартный)
    public void initialize(String name, int age) {
        this.name = name;
        this.weight = weightAverage;
        this.age = age;
        this.address = null;
    }

    // - вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize(int weight, String color) {
        this.name = null;
        this.weight = weight;
        this.age = ageAverage;
        this.address = null;
    }

    // - вес, цвет, адрес ( чужой домашний кот)
    public void initialize(int weight, String color, String address) {
        this.name = null;
        this.weight = weight;
        this.age = ageAverage;
        this.address = address;
    }
}
