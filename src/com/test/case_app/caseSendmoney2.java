package com.test.case_app;

import java.util.Random;
import java.util.Scanner;

public class caseSendmoney2 {
    public static void main(String[] args) {
        int[] arr = {9, 666, 188, 520, 9999};
        sendmoney2(arr);
    }

    public static void sendmoney2(int[] a) {
        Random ra = new Random();
        for (int i = 0; i < a.length; i++) {
            int index = ra.nextInt(a.length);
            int temp = a[index];
            a[i] = a[index];
            a[index] = temp;
            System.out.println("money"+a[i]);
        }
    }
}
