public class Demo1_array {
    public static void main(String[] args) {
        int[] arr = new int[]{6};

        int start = 0;
        int end = arr.length - 1;
        
        while(start<end){
            int z = arr[start];
            arr[start] = arr[end];
            arr[end] = z;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
