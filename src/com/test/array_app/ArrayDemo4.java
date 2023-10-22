package com.test.array_app;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] doubles = new double[6];
        double sum = 0;
        //int pw = 1;
        for (int i = 0; i < doubles.length; i++) {
            System.out.println("no." + (i + 1) + " in add:");//(pw=i+1)
            doubles[i] = sc.nextDouble();
            System.out.println(doubles[i]);
            sum += doubles[i];
            // pw++;
        }
        System.out.println("your:" + sum / doubles.length);
    }
}
