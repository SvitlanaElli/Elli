package com.test;

import java.lang.System;
import static java.lang.Integer.sum;

public class Main {

    public static void main (String[] args) {
        int array[] = {3, 5, 7, 12};
        int sum = 0;
        for (int i = 0; i < array.length; ++i)
            sum += array[i];
        System.out.println(sum);
    }
}