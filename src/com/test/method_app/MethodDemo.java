package com.test.method_app;

public class MethodDemo {
    public static void main(String[] args) {
        int max = sum(10, 20);
        System.out.println(max);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
