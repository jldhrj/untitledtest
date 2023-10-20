package com.test.loop;

public class looploop {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            System.out.println("第一层" + i);
            for (int j = 1; j < 3; j++) {
                System.out.println("第二层" + j);
                for (int k = 1; k < 3; k++) {
                    System.out.println("第三层" + k);
                    System.out.println("------------");

                }

            }

        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 0; i < 3; i++) {
            if (i==1){
                System.out.println("1"+i);
                continue;
            }
            System.out.println("123"+i);
            if (i==3){
                System.out.println("out"+i);
                break;
            }

        }
    }
}
