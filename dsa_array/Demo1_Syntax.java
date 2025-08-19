import java.util.Arrays;
import java.util.Scanner;

public class Demo1_Syntax {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int arr2[] = new int[5];
        int[] arr3 = new int[]{0,0,0,0,0};
        int[] arr4 = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            System.out.print("Enter: ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        // for(int i=0;i<arr1.length;i++){
        //     System.out.println("Index: "+i+", value: "+arr1[i]);
        // }

        System.out.println(Arrays.toString(arr1));
        
    }
}
