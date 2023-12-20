package com.test.object;

public class Test2 {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        s1.setName("qq");
        s1.setSocer(9);
        System.out.println(s1.getName());
        System.out.println(s1.getSocer());
        Student2to s2=new Student2to(s1);
        s2.pint();
    }
}
