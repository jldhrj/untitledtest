package com.test.loop;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random sj = new Random();
        for (int i = 1; i < 5; i++) {
            int number = sj.nextInt(11);
            System.out.println(number);
        }
        for (int i = 1; i < 20; i++) {
            int data = sj.nextInt(10) + 1;
            System.out.println(data);
        }
        for (int i = 1; i < 20; i++) {
            int data = sj.nextInt(15) + 3;
            System.out.println(data);
        }

        System.out.println("------------------------");
        for (int i = 1; i < 20; i++) {
            int data2 = sj.nextInt(27) + 65;
            System.out.println(data2);
        }

        System.out.println("-----------------");
        int sp = sj.nextInt(101);
        Scanner sa = new Scanner(System.in);
        while (true) {
            System.out.println("pc in nubmer:");
            int pc = sa.nextInt();
            if (pc - sp < 0) { //pc<sp
                System.out.println("-");
            } else if (pc - sp > 0) {//pc>sp
                System.out.println("+");

            } else {
                System.out.println("yes");
                System.out.println("sysnubmer"+sp + ",younubmer" + pc);
                break;
            }

        }

    }
}
