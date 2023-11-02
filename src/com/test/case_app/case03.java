package com.test.case_app;

import java.util.Scanner;

public class case03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("有几个人？：");
        int scpw = sc.nextInt();
        double[] b = new double[scpw];
        for (int i = 0; i < b.length; i++) {
            System.out.println((i + 1) + "号评委请输入：");
            b[i] = sc.nextDouble();
        }
        System.out.println("平均分是：" + px(b));
    }

    public static double px(double[] a) {
        double pgup = 0;
        double pgdn = a[0];
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            if (pgup < a[i]) {
                pgup = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (pgdn > a[i]) {
                pgdn = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (pgup == a[i]) {
                a[i] = 0;
                break;
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (pgdn == a[i]) {
                a[i] = 0;
                break;
            }

        }
        for (int i = 0; i < a.length; i++) {
            max += a[i];

        }

        return max / a.length;
    }
}
