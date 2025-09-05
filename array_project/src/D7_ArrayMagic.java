import java.util.Arrays;
public class D7_ArrayMagic {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        update(arr);
        System.out.println(Arrays.toString(arr));

        String name = new String("Mukesh");
        greet(name);
        System.out.println(name);
    }

    public static void update(int[] nums){
        nums[0] = 5;
        System.out.println(Arrays.toString(nums));
    }
    public static void greet(String n){
        n = "Welcome "+n;
    }
}
