package com.test.case_app;

import java.util.Random;
import java.util.Scanner;

public class case10 {
    public static void main(String[] args) {

        print(userselectNumber());
        System.out.println("您的号码");
        print(sysinnumber());
        System.out.println("中奖号码");
        judge(userselectNumber(),sysinnumber());
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");

        }
        System.out.println();
    }

    public static int[] userselectNumber() {
        int[] number = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < number.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红球号码1-33");
                int numbers = sc.nextInt();
                if (numbers < 1 || numbers > 33) {
                    System.out.println("不是1和33之间的号码");
                } else {
                    if (exist(number, numbers)) {
                        System.out.println("重复输入");
                    } else {
                        number[i] = numbers;
                        break;
                    }
                }
            }
        }
        while (true) {
            System.out.println("请输入篮球号码一个");
            int numbers = sc.nextInt();
            if (numbers < 1 || numbers > 16) {
                System.out.println("请输入篮球1到16之间");
            } else {
                number[6] = numbers;
                break;
            }
        }
        return number;
    }

    private static boolean exist(int[] number, int numbers) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == numbers) {
                return true;
            }

        }
        return false;
    }

    public static int[] sysinnumber() {
        int[] number = new int[7];
        Random ra = new Random();
        for (int i = 0; i < number.length - 1; i++) {
            while (true) {
                int numbers = ra.nextInt(33) + 1;
                if (!exist(number, numbers)) {
                    number[i] = numbers;
                    break;
                }
            }
        }
        number[6] = ra.nextInt(16) + 1;
        return number;
    }

    public static void judge(int[] userunmber, int[] sysnumber) {
        int rednumber = 0;
        int bluenumber = 0;
        for (int i = 0; i < userunmber.length - 1; i++) {
            for (int j = 0; j < sysnumber.length - 1; j++) {
                if (userunmber[i] == sysnumber[i]) {
                    rednumber++;
                    break;
                }
            }
        }
        bluenumber = userunmber[6] == sysnumber[6] ? 1 : 0;
        System.out.println("命中红球数量是" + rednumber);
        System.out.println("命中蓝球数量是" + bluenumber);
        if (rednumber == 6 && bluenumber == 1) {
            System.out.println("一等奖");
        } else if (rednumber == 6 && bluenumber == 0) {
            System.out.println("二等奖");
        } else if (rednumber == 5 && bluenumber == 1) {
            System.out.println("三等奖");
        } else if (rednumber == 5 && bluenumber == 0) {
            System.out.println("四等奖");
        } else if (rednumber == 4 && bluenumber == 1) {
            System.out.println("五等奖");
        } else if (rednumber == 4 && bluenumber == 0) {
            System.out.println("六等奖");
        } else if (rednumber == 3 && bluenumber == 1 ) {
            System.out.println("七等奖");
        } else if (rednumber < 2 && bluenumber == 0 || bluenumber == 1) {
            System.out.println("没等奖");
        }
    }
}
