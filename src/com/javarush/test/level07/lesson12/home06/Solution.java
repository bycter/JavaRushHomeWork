package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {

    public static void main(String[] args) {

        Human grandFather1 = new Human("Василий", "мужской", 75);
        Human grandMother1 = new Human("Мария", "ж", 70);

        Human grandFather2 = new Human("Денис", "мужской", 74);
        Human grandMother2 = new Human("Анна", "ж", 71);

        Human father = new Human("Александр", "муж", 45, grandFather1, grandMother1);
        Human mother = new Human("Татьяна", "ж", 43, grandFather2, grandMother2);

        Human daughter1 = new Human("Галина", "ж", 21, father, mother);
        Human daughter2 = new Human("Валентина", "ж", 19, father, mother);
        Human son1 = new Human("Юрий", "м", 17, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(daughter1);
        System.out.println(daughter2);
        System.out.println(son1);
    }

    public static class Human {

        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, String sexString, int age) {

            this.name = name;
            setSex(sexString);
            this.age = age;
        }

        public Human(String name, String sexString, int age, Human father, Human mother) {

            this.name = name;
            setSex(sexString);
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {

            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

        public void setSex(String sex) {

            if (sex.contains("муж")|| sex.equals("м")) this.sex = true;
            else if (sex.contains("жен") || sex.equals("ж")) this.sex = false;
            else this.sex = true;
        }
    }

}
