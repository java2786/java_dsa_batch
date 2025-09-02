public class D1_array {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,5,-4,8,0,9,-3,10,7,-2,6,2};

        // int min_value = Integer.MAX_VALUE;
        int min_value = arr[0];
        int max_value = arr[0];
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            // find min
            if(arr[i]<min_value){
                min_value = arr[i];
            }
            // find max
            if(arr[i]>max_value){
                max_value = arr[i];
            }
            // sum
            sum = sum + arr[i];
        }

        System.out.println("Min value is "+min_value);
        System.out.println("Max value is "+max_value);
        System.out.println("Total is "+sum);
        System.out.println("Length is "+arr.length);
        System.out.println("Average is "+(double)sum/arr.length);
    }
}
