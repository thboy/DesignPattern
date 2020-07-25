package io.github.thboy._2_Prototype.demo2;

public class UserDefinedCopyConstructorExample {
    public static void main(String[] args) {
        System.out.println("***user defined copy constuctor example in java***\n");
        Student student1 = new Student(1,"John");
        System.out.println("The details of Student1 is as follows:");
        student1.displayDetails();
        System.out.println("\n Copying student1 to student2 now");
        //Invoking the user-defined ocpy constructor
        Student student2 = new Student(student1);
        System.out.println("  The details of Student2 is as follow");
        student2.displayDetails();
    }
}
