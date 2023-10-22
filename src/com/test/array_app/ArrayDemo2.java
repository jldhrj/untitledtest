package com.test.array_app;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] ages2 = {123, 33, 22, 55};
        // int number=ages2.length;
        // double[] scores2 = {11.11, 22.22, 33.33, 444, 555};
//        System.out.println(ages2[0]);
//        System.out.println(ages2[1]);
//        System.out.println(ages2[2]);
//        System.out.println(ages2[3]);
        for (int i = 0; i < ages2.length; i++) {
            System.out.println(ages2[i]);

        }
        for (int i = 0; i < ages2.length; i++) {//ages2.length.fori
            System.out.println(ages2[i]);
        }
        int sum = 0;
        for (int i = 0; i < ages2.length; i++) {
            sum += ages2[i];
            System.out.println(sum);

        }
    }
}
