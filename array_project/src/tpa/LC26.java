package tpa;

public class LC26 {
    
    public int removeDuplicates(int[] nums) {
        int start = 0;
        int end = 1;

        while(end < nums.length){
            if(nums[start]!=nums[end]){
                start++;
                nums[start] = nums[end];
            }

            end++;
        }
        return start+1;
    }
}



// [0,0,1,1,1,2,2,3,3,4]
// [0,0,1,1,1,3,3,4,x,x]

// 2