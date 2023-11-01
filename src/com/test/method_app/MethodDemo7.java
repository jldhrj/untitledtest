package com.test.method_app;

public class MethodDemo7 {
    public static void main(String[] args) {
        chu(3,0);
    }
    public static void chu(int a,int b){
        if (b==0){
            System.out.print("0???");
            return;
        }
        int c=a/b;
        System.out.printf("chu"+c);
    }
}

