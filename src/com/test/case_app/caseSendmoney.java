package com.test.case_app;

import java.util.Random;
import java.util.Scanner;

public class caseSendmoney {
    public static void main(String[] args) {
        int[] arr = {9, 666, 188, 520, 9999};
        sendmoney(arr);
    }

    public static void sendmoney(int[] a) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        for (int i = 0; i < a.length; i++) {
            while (true) {
                int index = ra.nextInt(a.length);
                int money = a[index];
                if (money != 0) {
                    System.out.println(money);
                    a[index] = 0;
                    break;
                }
            }

        }
        System.out.println("end");
    }
}
