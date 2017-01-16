package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        Human daughter1 = new Human("Галина", true, 21, null);
        Human daughter2 = new Human("Валентина", true, 19, null);
        Human son1 = new Human("Юрий", false, 17, null);

        ArrayList<Human> children0 = new ArrayList<>();
        children0.add(daughter1);
        children0.add(daughter2);
        children0.add(son1);

        Human father = new Human("Александр", false, 45, children0);
        Human mother = new Human("Татьяна", true, 43, children0);

        ArrayList<Human> children1 = new ArrayList<>();
        children1.add(father);
        children1.add(mother);

        Human grandFather1 = new Human("Василий", false, 75, children1);
        Human grandMother1 = new Human("Мария", true, 70, children1);

        Human grandFather2 = new Human("Денис", false, 74, children1);
        Human grandMother2 = new Human("Анна", true, 71, children1);

        ArrayList<Human> humen = new ArrayList<>();
        humen.add(grandFather1);
        humen.add(grandFather2);
        humen.add(grandMother1);
        humen.add(grandMother2);
        humen.add(father);
        humen.add(mother);
        humen.add(son1);
        humen.add(daughter1);
        humen.add(daughter2);

        for (Human human : humen) {
            System.out.println(human);
        }
    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (children != null) {

                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }

            return text;
        }
    }

}
