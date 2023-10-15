package com.test.out02;

public class SanYuan {
    public static void main(String[] args) {
        double score = 19.2;
        String rs = score >= 60 ? "YES" : "NO";
        System.out.println(rs);
        int a = 22;
        int b = 3;
        int rr = a > b ? a : b;
        System.out.println(rr);
        int aa = 10;
        int bb = 20;
        int cc = 30;
        int temp = aa > bb ? aa : bb;
        int max = temp > cc ? temp : cc;
        System.out.println(max);

    }


}
