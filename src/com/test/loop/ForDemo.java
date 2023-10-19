package com.test.loop;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("次数" + i);
        }
        for (int i = 0; i < 5; i += 2) {
            System.out.println("次数" + i);
        }
        int wot = 0;
        for (int i = 1; i <= 10; i++) {
            wot += i;
            System.out.println(wot);
        }
        int js = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                js += i;
            }
            System.out.println(js);

        }
    }
}
