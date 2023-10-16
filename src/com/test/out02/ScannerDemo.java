package com.test.out02;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("age?");
        int age = sc.nextInt();
        System.out.println("name?");
        String name = sc.next();
        System.out.println("age"+age  + "name"+name);
    }
}
