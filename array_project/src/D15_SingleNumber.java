import java.util.HashMap;

public class D15_SingleNumber {
    public static int singleNumber(int[] nums){
        int r = 0;
        for(int n: nums){
            r = r^n;
        }
        return r;
    }

    public static int singleNumber2(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3};
        // int[] arr = {1,2,2,3,4,1,2,3};
        // int[] arr = {1,2,5,3,4,1,2,3};

        int result = singleNumber(arr);
        System.out.println("Result: "+result);
        System.out.println("Indian Adult: "+isIndianAdult("Indian", 25));
    }


    static boolean isIndianAdult(String citizen, int age){
        // Indian, 18>= true
        // false
        String indian = new String("Indian");
        return citizen.equals(indian) && age>17;

    }
}
