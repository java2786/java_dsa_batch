public class L643 {
    
    static public double findMaxAverage(int[] nums, int k) {

        if(nums.length==1){
            return (double)nums[0];
        }
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        max_sum = sum;
        // 2
        for(int i=k;i<nums.length;i++){
            sum -= nums[i-k];
            sum += nums[i];

            max_sum = Math.max(sum, max_sum);
        }
        return max_sum/(double)k;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3;

        System.out.println(findMaxAverage(arr, k));
    }
}