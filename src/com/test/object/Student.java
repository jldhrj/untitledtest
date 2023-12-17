package com.test.object;

public class Student {
    String name;
    double chinese;
    double mathl;
    double socer;

    public Student() {
        System.out.println("null");
    }

    public Student(String name, double socer) {
        System.out.println("1");
        this.name=name;
        this.socer=socer;
    }

    public void print() {
        System.out.println(name + "sum:" + (chinese + mathl));
    }

    public void print2() {
        System.out.println(name + "/:" + (chinese + mathl) / 2.0);
    }

    public void socer(double socer) {
        if (this.socer > socer) {
            System.out.println(1);
        } else System.out.println(0);
    }
}

