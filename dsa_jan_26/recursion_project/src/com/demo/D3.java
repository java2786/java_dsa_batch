package com.demo;

public class D3 {
    static void printDigits(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }

        sum += num%10;
        printDigits(num/10, sum);
        

    }

    public static void main(String[] args) {
        int num = 12345;
        printDigits(num, 0);
    }
}
