package com.test;

import java.lang.System;

public class Main {

    public static void main (String[] args) {
        int[] array = {3, 5, 7, 12};
        int sum = 0;
        for (int j : array) sum += j;
        System.out.println(sum);
    }
}