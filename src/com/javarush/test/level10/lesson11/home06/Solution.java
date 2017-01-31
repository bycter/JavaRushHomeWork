package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

    }

    public static class Human {

        String firstName;
        String lastName;
        int age;
        String sex;
        ArrayList<Human> parents;
        ArrayList<Human> chilren;

        public Human(String firstName) {

            this.firstName = firstName;
        }

        public Human(String firstName, String lastName) {


            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int age) {


            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName, String sex) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, int age, String sex) {


            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, ArrayList<Human> parents) {

            this.firstName = firstName;
            this.parents = parents;
        }

        public Human(String firstName, ArrayList<Human> parents, ArrayList<Human> chilren) {

            this.firstName = firstName;
            this.parents = parents;
            this.chilren = chilren;
        }

        public Human(String firstName, String lastName, ArrayList<Human> parents) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.parents = parents;
        }

        public Human(String firstName, String lastName, ArrayList<Human> parents, ArrayList<Human> chilren) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.parents = parents;
            this.chilren = chilren;
        }

        public Human(String firstName, String lastName, int age, String sex, ArrayList<Human> parents, ArrayList<Human> chilren) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.parents = parents;
            this.chilren = chilren;
        }
    }
}
