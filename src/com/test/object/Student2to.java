package com.test.object;

public class Student2to {
    private Student2 student2;
    public Student2to(Student2 student2){
        this.student2=student2;
    }
    public void pint(){
        if (student2.getSocer()>=60){
            System.out.println("yes"+student2.getName());
        }else System.out.println("no"+student2.getName());
    }
}
