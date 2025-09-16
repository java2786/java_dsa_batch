public class D5_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        return max;

    }

        public int findMaxConsecutiveOnes2(int[] arr) {
        int max = 0;
        int zeros = 0;
        int ones = 0;
        // iterate array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                zeros = 0;
                ones++;
                if(max<ones){
                    max = ones;
                }
            }
            if(arr[i]==0) {
                ones = 0;
                zeros++;
                if(max<zeros){
                    //max = zeros;
                }
            }
        }
        return max;
    }
}