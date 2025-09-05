import java.util.Arrays;

class Employee{
    String name;

    // public String toString() {
    //     return name;
    // }
}
public class D6_ArrayToString {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        System.out.println(arr); // [4 3 2 1]
        // for loop
        System.out.println(Arrays.toString(arr));

        // String[] names = {"Abc", "Xyz"};
        // System.out.println(names);
        // Employee ram = new Employee();
        // ram.name = "Ram kapoor";
        // System.out.println(ram); // ?
    }
}

// [I@7ad041f3
// Employee@7344699f
