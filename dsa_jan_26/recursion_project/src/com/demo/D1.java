package com.demo;

public class D1 {

    static void display(String name,int count){
        // base case
        if(count>15){
            return;
        }
        System.out.println(name+ " "+count);
        
        // recursion -> head, tail 
        display(name, count+1);
    }
    public static void main(String[] args) {
        display("Java",1);
    }
}
