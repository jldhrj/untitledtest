package com.test.out02;

public class Out02 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("123");
        System.out.println("aa" + a);
        System.out.println(6 + a);
        System.out.println("inini" + a + 'a');
        System.out.println(a + 'a' + "ninin");
        int b = 4;
        --b;
        System.out.println(b);
        int c = 4;
        int w = ++c;
        System.out.println(c);
        System.out.println(w);
        int aa = 4;
        int ee = aa++;
        System.out.println(aa);
        System.out.println(ee);
        double size = 9.8;
        int ram = 16;
        boolean rr = size >= 6.95 & ram >= 16;
        System.out.println(rr);
        boolean ss = size >= 16.95 | ram >= 116;
        System.out.println(ss);
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(2 > 1));
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        int q = 10;
        int e = 20;
        System.out.println(q > 100 && ++e > 2);
        System.out.println(e);
        int qq=10;
        int ww=30;
        System.out.println(qq>9 || ww++ >99);
        System.out.println(ww);

    }
}
