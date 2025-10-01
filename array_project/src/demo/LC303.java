package demo;

import java.util.Arrays;

public class LC303 {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};

    NumArray obj = new NumArray(nums);
    int param_1 = obj.sumRange(0,5);
        System.out.println(param_1);
    }
}
class NumArray{
    
    int[] myArray = null;
    public NumArray(int[] nums) {
        this.myArray = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            myArray[i] = sum;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("**** constructor ends");
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return myArray[right];
        }
        return myArray[right] - myArray[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */