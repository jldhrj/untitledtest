package com.test.case_app;

public class case06 {
    public static void main(String[] args) {
        System.out.println(select(101, 200));
    }

    public static int select(int star, int end) {
        int sum = 0;
        for (int i = star; i <= end; i++) {
            boolean fg = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    fg = false;
                    break;
                }
            }
            if (fg) {
                System.out.println(i);
                sum++;
            }
        }
        return sum;

    }
}
