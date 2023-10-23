package com.test.array_app;

public class ArrayFaceDemo2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr.length);
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp=arr[j];//4#50
            arr[j]=arr[i];//j=0#10
            arr[i]=temp;//i=50
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
