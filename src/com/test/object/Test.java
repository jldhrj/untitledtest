package com.test.object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="bon";
        s1.chinese=100;
        s1.mathl=100;
        s1.print();
        s1.print2();
        Student s2 = new Student();
        s2.name="boz";
        s2.chinese=44;
        s2.mathl=55;
        s2.print();
        s2.print2();
        Student s3=new Student("“123”",123);
        s3.socer=100;
        s3.socer(200);
        Student s4=new Student("qqq",22);
        System.out.println(s4.name);
        System.out.println(s4.socer);
    }
}
