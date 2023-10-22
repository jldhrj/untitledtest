package com.test.array_app;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        int[] arr2 = {11, 22, 33};
        System.out.println(arr);
        System.out.println(arr2);
        int[] arr3 = arr;
        System.out.println(arr3);
        int[] arr4=null;
        System.out.println(arr4);
        System.out.println(arr4[0]);
        System.out.println(arr4.length);
    }
}
