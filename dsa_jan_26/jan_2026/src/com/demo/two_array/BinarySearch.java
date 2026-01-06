package com.demo.two_array;

public class BinarySearch {
    static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            System.out.println("In while");
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 4, 6, 9, 10, 15, 19, 25 };
        int search = 12;

        System.out.println(binary_search(array, search));
    }
}
