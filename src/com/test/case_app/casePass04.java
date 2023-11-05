package com.test.case_app;

public class casePass04 {
    public static void main(String[] args) {
        int[] a = {0, 0, 20, 50};
        System.out.println(password(a));
    }

    public static String password(int[] arr) {
        String pass = "";
        int[] max = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            max[i] += (arr[i] + 5) % 10;
        }
        for (int i = 0, j = max.length - 1; i < j; i++, j--) {
            int temp = max[j];
            max[j] = max[i];
            max[i] = temp;
        }
        for (int i = 0; i < max.length; i++) {
            pass += max[i];
        }
        return pass;
    }

}
