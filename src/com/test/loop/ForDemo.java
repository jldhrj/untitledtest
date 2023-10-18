package com.test.loop;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("次数" + i);
        }
        for (int i = 0; i < 5; i += 2) {
            System.out.println("次数" + i);
        }
    }
}
