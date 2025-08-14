public class Rec14_LongestSubArray{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,4,4,4}; // 5
        // int[] arr = new int[]{1,1,1,1,1,2,3,3,4}; // 5
        subArray(arr, 1, 0, 0);
    }

    static void subArray(int[] arr, int i, int count, int max){
        if(i==arr.length){
            System.out.println(max+1);
            return;
        }

        if(arr[i]==arr[i-1]){
            count++;
        } else {
            count = 0;
        }
        if(count>max){
            max = count;
        }

        subArray(arr, i+1, count, max);
    }
}