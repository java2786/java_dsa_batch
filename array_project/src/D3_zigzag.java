package array_project.src;

import java.util.Arrays;

public class D3_zigzag {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 7, 8, 6, 2, 1};
        zigZag(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void zigZag(int[] arr) {
        boolean flag = true;
        // code here
        // 0 1, 1 2, 2 3, 4 5, 5 6 
        for(int i=1;i<arr.length;i++){
            // put small val at prev index
            if(flag == true){
                
                if(arr[i-1]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
                
            }
            // put larger val at prev index
            if(flag==false){
                if(arr[i-1]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
            flag = !flag;
            
        }
    }
}

