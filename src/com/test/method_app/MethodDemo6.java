package com.test.method_app;

public class MethodDemo6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(toto(arr1, arr2));
    }

    public static boolean toto(int[] a, int[] b) {
        boolean tf = false;
        if (a.length != b.length) {
            tf = false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                tf = true;
            } else {
                tf = false;
                break;
            }
        }

        return tf;
    }
}
