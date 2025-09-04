import java.util.ArrayList;
import java.util.Collections;

public class D4_Leader {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max = arr[i];
                list.addFirst(arr[i]);
            }
        }
        // Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        // int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int[] arr = new int[]{61, 61, 17};
        ArrayList<Integer> result = leaders(arr);
        System.out.println(result); // [17, 5, 2]
    }
}
