package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jinxMouse = new Mouse("Jinx", 12, 5);
        Mouse muscleMouse = new Mouse("Muscle", 15, 8);
        Mouse pekosMouse = new Mouse("Pekos", 12, 6);
        Mouse taffiMouse = new Mouse("Taffi", 7, 3);

        Dog spikeDog = new Dog("Spike", 50, 10);
        Dog tikeDog = new Dog("Tike", 20, 4);

        Cat tomCat = new Cat("Tom", 30, 25);
        Cat butchCat = new Cat("Butch", 35, 30);
        Cat tutsCat = new Cat("Tuts", 30, 30);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
