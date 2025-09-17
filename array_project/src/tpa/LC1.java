package tpa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1 {
    
    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            } else {
                int cn = target - nums[i];
                map.put(cn, i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,7,4,5};
        int t = 8;
        System.out.println(Arrays.toString(twoSum(arr, t)));
    }
}
