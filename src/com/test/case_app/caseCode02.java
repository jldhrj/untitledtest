package com.test.case_app;

import java.util.Random;

public class caseCode02 {
    public static void main(String[] args) {
        System.out.println(code(66));

    }

    public static String code(int ina) {
        Random ra = new Random();
        String codeback = "";
        for (int i = 1; i <= ina; i++) {
            int type = ra.nextInt(3);
            switch (type) {
                case 0:
                    codeback += ra.nextInt(9);
                    break;
                case 1:
                    char char1 = (char) (ra.nextInt(26) + 65);
                    codeback += char1;
                    break;
                case 2:
                    char char2 = (char) (ra.nextInt(26) + 97);
                    codeback += char2;
                    break;
                default:
            }
        }
        return codeback;
    }


}
