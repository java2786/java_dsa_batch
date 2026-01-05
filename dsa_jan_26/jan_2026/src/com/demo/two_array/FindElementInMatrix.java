package com.demo.two_array;

public class FindElementInMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3, 5, 1, 2},{4, 2, 5, 1},{3, 1, 1, 3}};


        int target = 2;
        int count = 0;
        // search how many targets are in this matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    count++;
                }
            }
        }


        System.out.println(count);
    }
}
