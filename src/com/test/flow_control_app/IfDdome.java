package com.test.flow_control_app;

import java.util.Scanner;

public class IfDdome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("温度多少？");
        double tw = sc.nextDouble();

        if (tw >= 36) {
            System.out.println("超标了" + tw);
        } else if (tw < 36) {
            System.out.println("凉了" + tw);
        }
        double money=9.9;
        if (money >= 99){
            System.out.println("ok"+money);
        }
        else {
            System.out.println("no"+money);
        }

        System.out.println("分数？");
        double fs=sc.nextDouble();
        if (fs>=80&&fs<100){
            System.out.println("优秀"+fs);
        }
        else if (fs>=60&&fs<80){
            System.out.println("及格"+fs);
        }
        else if (fs>=0&&fs<60){
            System.out.println("不及格"+fs);
        }
        else {
            System.out.println("!!!?????");
        }




    }
}
