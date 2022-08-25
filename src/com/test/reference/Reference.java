package com.test.reference;

public class Reference {

    public static void main(String[] args) {
        Person javelin = new Person();
        Person byraktar = new Person();

        javelin.name = "Javelin";
        javelin.age = 5;

        byraktar.name = "Byraktar";
        byraktar.age = 3;

        System.out.println("Javelin age is: " + javelin.age + ", Byraktar age is: " + byraktar.age);

    }

    static class Person {
       String name;
       int age;
    }
}
