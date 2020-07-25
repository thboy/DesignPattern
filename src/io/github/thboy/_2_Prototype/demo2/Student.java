package io.github.thboy._2_Prototype.demo2;

public class Student {
    int rollNo;
    String name;
    //Instance Constructor
    public Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    //copy Constructor
    public Student(Student student){
        this.name = student.name;
        this.rollNo = student.rollNo;
    }

    public void displayDetails(){
        System.out.println("Student name :"+name+",Roll no: "+rollNo);
    }

    public void main(String args[]){
        System.out.println();
    }
}
