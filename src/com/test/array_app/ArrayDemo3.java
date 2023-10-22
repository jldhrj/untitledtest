package com.test.array_app;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        char[] chars = new char[3];
        for (int i = 0; i < chars.length; i++) {
            System.out.println((int) chars[i]);
        }
        double[] doubless = new double[22];
        for (int i = 0; i < doubless.length; i++) {
            System.out.println(doubless[i]);
        }
        boolean[] booleans = new boolean[11];
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }
        String[] Strings = new String[11];
        for (int i = 0; i < Strings.length; i++) {
            System.out.println(Strings[0]);
        }

    }
}
