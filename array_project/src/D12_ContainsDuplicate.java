import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class D12_ContainsDuplicate {
    

    public boolean containsDuplicate4(int[] nums) {
        // 1 3 2 1
        Map<Integer, Integer> map = new HashMap<>();
        // 1-0,3-1,2-2
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         return true;
        //     }else {
        //         map.put(nums[i], i);
        //     }
        // }
        for(int n:nums){
            if(map.containsKey(n)){
                return true;
            }else {
                map.put(n, 1);
            }
        }
        return false;
    }
    public boolean containsDuplicate2(int[] nums) {
        // sort
        Arrays.sort(nums);
        // 1 1 2 3
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                return true;
            }
        }
        return false;
    }
    public boolean containsDuplicate3(int[] nums) {
        // 1 1 2 3
        // hashset
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        // 1 2 3
        return set.size()<nums.length;
    }
   
}
