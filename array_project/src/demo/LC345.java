package demo;

class Employee{
    private int salary = 50000;
    public int findSalary() {
        // read file for pwd

        // data base connection

        // row -> obj

        return 60000;
    }
}

public class LC345 {
        public static String reverseVowels(String s) { // abchellog
        char[] arr = s.toCharArray();

        int start = 0;              // 0
        int end = arr.length - 1;   // 4

        while(start < end){
            while(start <end && isVowel(arr[start])==false){
                start++;
            }
            while(start<end && isVowel(arr[end])==false){
                end--;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
// B
    static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }


    public static void main(String[] args) {
        String s = "Hello";
        int start = 1;
        int end = 4;

        System.out.println(reverseVowels(s));

    }
}
