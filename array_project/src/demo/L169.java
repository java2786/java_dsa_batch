package demo;

import java.util.HashMap;

public class L169 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int max = majorityElement(arr);
        System.out.println("Max occurrance: "+max);
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                // if(map.get(n)!=null){
                // key found
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        int max_count = Integer.MIN_VALUE;
        int max_num = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > max_count) {
                max_count = map.get(key);
                max_num = key;
            }
        }
        return max_num;
    }
}
