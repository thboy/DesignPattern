package io.github.thboy._3_BuilderPattern.demo1;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;
    public Product(){
        parts = new LinkedList<String>();
    }
    public void add(String part){
        //Adding parts
        parts.addLast(part);
    }
    public void showProduct(){
        System.out.println("\nProduct completed as below");
        for(String part : parts){
            System.out.println(part);
        }
    }
}
