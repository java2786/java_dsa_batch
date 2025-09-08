import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        // 3,4,1,3,4,5,6,2,3,4
        // no duplicate
        // 3,4,1,5,6,2 -> sort
        // 1,2,3,4,5,6 -> len 3 small

        // no duplicate + sort => set


// list, map, set
        Set<Integer> set = new TreeSet<>();
        for(int n:nums){
            set.add(n);
        }
        int[] arr = new int[set.size()];
        int index = 0;
        for(int n:set){
            arr[index] = n;
            index++;
        }
        // third maximum
        if(arr.length>2){
            return arr[arr.length-3];
        }
        // maximum
        else {
            return arr[arr.length-1];
        }
    }
}
public class D9_3rdMax {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,4,1,3,4,5,6,2,3,4};
        // int[] nums = {3,2,1}; // 1
        // int[] nums = {1,2}; // 2
        // int[] nums = {2,2,3,1}; // 1
        System.out.println(s.thirdMax(nums));
    }
}
