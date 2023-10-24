package com.test.array_app;

import java.util.Random;
import java.util.Scanner;

public class ArrayFaceDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int pcsc = sc.nextInt();
            arr[i] = pcsc;
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//
//        }
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = rd.nextInt(arr.length);//index=2
            int temp = arr[index];//temp=arr[2]
            arr[index]=arr[i];//arrindex[2]=arr[i++]
            arr[i]=temp;//arr[]=arr[2]
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"，");
        }

    }
}
