package com.demo.two_array;

import java.util.Arrays;

/*
    [ 3 5 1 2 ]     [ 1 2 2 1 ]          [ 0 0 0 0 ]
    [ 4 2 5 1 ]  +  [ 3 2 3 2 ]     =    [ 0 0 0 0 ]
    [ 3 1 1 3 ]     [ 1 1 1 3 ]          [ 0 0 0 0 ]


    [ 3 5 1 2 ]     [ 1 2 2 1 ]          [ 4 7 3 3 ]
    [ 4 2 5 1 ]  +  [ 3 2 3 2 ]     =    [ 7 4 8 3 ]
    [ 3 1 1 3 ]     [ 1 1 1 3 ]          [ 4 2 2 6 ]



    arr1 -> [ 3 5 1 ], [ 4 2 5 ], [ 3 1 1 ]
    array in array -> 2D array
*/

public class Add2DArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{3, 5, 1, 2},{4, 2, 5, 1},{3, 1, 1, 3}};
        int[][] arr2 = new int[][]{{1, 2, 2, 1},{3, 2, 3, 2},{1, 1, 1, 3}};

        // System.out.println("Array1 len: "+arr1.length);
        // System.out.println("Array1 (0) -> nested array: "+arr1[0].length);

        int r = arr1.length;
        int c = arr1[0].length;

        int[][] arr3 = new int[r][c];

        // System.out.println(Arrays.toString(arr1[0]));
        // System.out.println(arr1[2][1]); // 1
        // System.out.println(arr1[1][2]); // 5


        // print all elements of arr1
        // System.out.print(arr1[0][0]+" ");
        // System.out.print(arr1[0][1]+" ");
        // System.out.print(arr1[0][2]+" ");
        // System.out.println(arr1[0][3]+" ");
        
        // System.out.print(arr1[1][0]+" ");
        // System.out.print(arr1[1][1]+" ");
        // System.out.print(arr1[1][2]+" ");
        // System.out.println(arr1[1][3]+" ");
        
        // System.out.print(arr1[2][0]+" ");
        // System.out.print(arr1[2][1]+" ");
        // System.out.print(arr1[2][2]+" ");
        // System.out.println(arr1[2][3]+" ");

        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++)    
                System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
        System.out.println("======");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++)    
                System.out.print(arr2[i][j]+" ");
            System.out.println();
        }
        System.out.println("Adding");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++)    
                arr3[i][j] = arr1[i][j]+arr2[i][j];
        }
        
        System.out.println("======");
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++)    
                System.out.print(arr3[i][j]+" ");
            System.out.println();
        }
    }
}
