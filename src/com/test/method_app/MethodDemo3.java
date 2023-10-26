package com.test.method_app;

public class MethodDemo3 {
    public static void main(String[] args) {
        int n = sum(100);
        System.out.println(n);
    }

    public static int sum(int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            max+=i+1;
        }
        return max;
    }
}
