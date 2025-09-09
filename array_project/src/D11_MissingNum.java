import java.util.Arrays;

class Solution {
    public int missingNumber4(int[] nums) {
        // 3 0 1
        int result = nums.length; // 3
        for(int i=0;i<nums.length;i++){
            result = result^(i^nums[i]);
        }
        return result;
    }
    public int missingNumber(int[] nums) {
        // pradeep -> sum

        int n = nums.length;
        int finalSum = (n*(n+1))/2; // 6
        int sum = 0;
        for(int num:nums){
            sum = sum + num;
        }
        // sum -> 4
        return finalSum - sum;
    }
    public int missingNumber2(int[] nums) {
        // ayush -> sort ->

        Arrays.sort(nums);
        // 0 1 3
        for(int i=0;i<nums.length;i++){
            // if(i==nums[i]){
            //     continue;
            // } else {
            //     return i;
            // }
            if(i!=nums[i]){
                return i;
            }

        }
        return nums.length;
   }
}

public class D11_MissingNum {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int result = nums.length; // 3
        for(int i=0;i<nums.length;i++){
            result = result^(i^nums[i]);
        }
        System.out.println(result);
        
    }
}
