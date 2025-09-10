import java.util.Arrays;

public class D13_PlusOne {
    // 0 0 0
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // 1 0 0 0
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        // int[] nums = {9,9,9};
        int[] nums = { 9, 7, 9 };
        // int[] nums = {4,2,3,1};
        // int[] nums = {9};
        // int[] nums = { 2, 3, 5 };
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
