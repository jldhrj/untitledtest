package com.test.case_app;

public class caseCopy05 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4};
        System.out.println(ar);
        System.out.println(copy(ar));
        prin(ar);
        prin(copy(ar));
    }

    public static void prin(int[] prin) {
        System.out.print("[");
        for (int i = 0; i < prin.length; i++) {
            System.out.print(i == prin.length - 1 ? prin[i] : prin[i] + ",");
        }
        System.out.println("]");
    }

    public static int[] copy(int[] arr) {
        int[] copy2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy2[i] = arr[i];

        }
        return copy2;
    }
}
