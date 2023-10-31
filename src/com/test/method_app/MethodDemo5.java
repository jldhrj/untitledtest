package com.test.method_app;

import java.util.Scanner;

public class MethodDemo5 {
    public static void main(String[] args) {
        int [] rr={12,13,23,33,44};
        soutarr(rr);

    }
    public  static  void soutarr(int[]arr){
        if (arr==null){
            System.out.println("null!");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length ? arr[i]:arr[i]+",");

        }
        System.out.println("]");
    }
}