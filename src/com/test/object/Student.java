package com.test.object;

public class Student {
    String name;
    double chinese;
    double mathl;
    public void print(){
        System.out.println(name+"sum:"+(chinese+mathl));
    }    public void print2(){
        System.out.println(name+"/:"+(chinese+mathl)/2.0);
    }
}
