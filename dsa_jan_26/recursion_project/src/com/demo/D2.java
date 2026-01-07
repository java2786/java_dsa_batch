package com.demo;

public class D2 {
    static void printDigits(int num){
        if(num==0){
            return;
        }
        System.out.println(num%10);
        printDigits(num/10);
        
        System.out.println(num%10);

    }

    public static void main(String[] args) {
        int num = 12345;
        printDigits(num);
        // 4 2 
        // 
    }
}
