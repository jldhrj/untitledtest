package com.test.method_app;

public class MethodDemo6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(toto(arr1, arr2));
    }

    public static boolean toto(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;

        } else if (a == null && b == null) {
            return false;
        } else if (a == null || b == null) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

