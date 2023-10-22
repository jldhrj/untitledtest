package com.test.array_app;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] ages = new int[]{12, 13, 22, 44};
        double[] scores = new double[]{12.1, 22.4, 44.5, 66, 666};
        int[] ages2 = {123, 33, 22, 55};
        double[] scores2 = {11.11, 22.22, 33.33, 444, 555};
        System.out.println(scores2);
        System.out.println(ages2);
        System.out.println(ages2.length);
        System.out.println(scores2.length);
        ages2[0]=1;
        ages2[1]=11;
        System.out.println(ages2[0]);
        System.out.println(ages2[1]);
        System.out.println(ages2.length - 1);

    }
}
