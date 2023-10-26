package com.test.method_app;

import java.util.Scanner;

public class MethodDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (numb(number) == 1) {
            System.out.println("奇");
        } else {
            System.out.println("偶");
        }

    }

    public static int numb(int n) {
        int max = 3;
        if (n % 2 == 1) {
            max = 1;
        } else if (n % 2 == 0) {
            max = 0;

        }
        return max;
    }
}
