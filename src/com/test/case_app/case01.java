package com.test.case_app;

public class case01 {
    public static void main(String[] args) {
        System.out.println(ven(2, 0, 100) + "rmb");
    }

    public static double ven(int mm, int vip, double price) {

        if (mm >= 5 && mm < 11) {
            switch (vip) {
                case 1:
                    price *= 0.9;
                    break;
                case 0:
                    price *= 0.85;
                    break;
            }
        } else if (mm == 11 || mm == 12 || mm == 1 || mm == 2 || mm == 3 || mm == 4) {
            switch (vip) {
                case 1:
                    price *= 0.7;
                    break;
                case 0:
                    price *=0.65;
                    break;
            }
        }

        return price;
    }
}
