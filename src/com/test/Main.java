package com.test;

import static java.lang.Math.max;

public class Main {

    public static final String SOME_TEXT = "some text";

    public static void main(String[] args) {
        System.out.println(SOME_TEXT);
        System.out.println(SOME_TEXT);
        System.out.println(SOME_TEXT);

        String s = "Domashka";

        print(s);

        printSum(2, 2);

    }

    public static void print(String string) {
        System.out.println(string);
    }
    private static void printSum(int a, int b) {
        int max = max(a, b);

    }

}

