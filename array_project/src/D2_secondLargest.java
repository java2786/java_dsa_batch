public class D2_secondLargest {
    public static int findSecondLargest(int[] arr){
        if(arr==null || arr.length<2){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]>secondLargest && arr[i]<largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 6, 4, 8}; // 8
        int[] arr2 = {12, 35, 1, 10, 34, 1}; // 34
        int[] arr3 = {1, 2, 3, 4, 5, 6}; // 5
        System.out.println(findSecondLargest(arr1));
        System.out.println(findSecondLargest(arr2));
        System.out.println(findSecondLargest(arr3));
    }
}
