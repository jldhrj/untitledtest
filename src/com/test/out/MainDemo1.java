package com.test.out;

import java.util.Scanner;

public class MainDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("弄几个数:");
        int number = sc.nextInt();
        System.out.println(number);
        System.out.println(number % 10);
        System.out.println(number / 10 % 10);
        System.out.println(number / 100 % 10);

    }
}
