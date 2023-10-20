package com.test.loop;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random sj = new Random();
        int number = sj.nextInt(11);
        System.out.println(number);

    }
}
