package tpa;

import java.util.Arrays;

public class LC27 {
    
    static public int removeElement(int[] nums, int val) {
        int counter = 0;
        int start = 0;
        while(start<nums.length){
            if(nums[start]!=val){
                nums[counter] = nums[start];
                counter++;
            }
            start++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(arr, val));
        System.out.println(Arrays.toString(arr));
    }
}