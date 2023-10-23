package com.test.array_app;

public class ArrayFaceDemo {
    public static void main(String[] args) {
        int[] faces = {15,9000,10000,20000,9500,-5};
        int max = faces[0];
        for (int i = 0; i < faces.length; i++) {
            if (faces[i]>faces[i+1]){
                break;
            }
            else if (faces[i]<faces[i+1]) {
                max=faces[i+1];
                System.out.println(max);
            }
        }
        System.out.println(max);
    }
}
