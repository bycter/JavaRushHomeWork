package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Ivan", 36, "Lenina st.");
        Man man2 = new Man("Dima", 24, "Orlovskaya st.");
        Woman woman1 = new Woman("Tanya", 26, "Odintsova st.");
        Woman woman2 = new Woman("Galina", 54, "Kotovskogo st.");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

        //выведи их на экран тут
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name) {
            this.name = name;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        //      5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name) {
            this.name = name;
        }

        public Woman(String name, int age) {

            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        //      5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}