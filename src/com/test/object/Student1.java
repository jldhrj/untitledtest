package com.test.object;

public class Student1 {
    private double socer;
    public void setSocer(double socer){
        if (socer>=0&&socer<=100) {
            this.socer = socer;
        }else System.out.println("in no");
    }
    public double getSocer(){
        return socer;
    }

    public void print(double  socer) {
        System.out.println(socer >= 60 ? "yes" : "no");
    }
}
