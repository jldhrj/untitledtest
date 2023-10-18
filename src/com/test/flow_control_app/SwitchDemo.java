package com.test.flow_control_app;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入周一到周日");
        String ymd = sc.next();
        switch (ymd) {
            case "周一":
                System.out.println(1);
                break;
            case "周二":
                System.out.println(2);
                break;
            case "周三":
                System.out.println(3);
                break;
            case "周四":
                System.out.println(4);
                break;
            case "周五":
                System.out.println(5);
                break;
            case "周六":
                System.out.println(6);
                break;
            case "周日":
                System.out.println(7);
                break;
            default:
                System.out.println("????!!!");
        }
    }
}
