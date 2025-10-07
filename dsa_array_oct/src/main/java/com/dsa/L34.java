package com.dsa;

import java.util.ArrayList;

public class L34 {
    public static void main(String[] args) {
        String name = "Superman";
        name = "Batman";
        
    }
    
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int low = 0;
        int hig = n-1;
        int idx =-1;
        while(low<=hig){
            int mid = (low + hig)/2;
            if(nums[mid]<target){
                low = mid +1;
            }else if (nums[mid] > target){
                hig = mid -1;
            }else{
            idx = mid;
            hig = mid -1;
            }
        }
        ans.add(idx);
         n = nums.length;
         low = 0;
         hig = n-1;
         idx =-1;
        while(low<=hig){
            int mid = (low + hig)/2;
            if(nums[mid]<target){
                low = mid +1;
            }else if (nums[mid] > target){
                hig = mid -1;
            }else{
            idx = mid;
            low = mid + 1;
            }
        }
        ans.add(idx);
        int[] result = new int[ans.size()]; 
        int i = 0; 
        for(int a:ans){
            result[i++] = a;
        }
        return result;
    }
}