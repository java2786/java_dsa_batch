package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class L3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        // window left 0
        int left = 0;
        // window right 0
        for(int right = 0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            // add 
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcdbbabcdecbb";

        int result = lengthOfLongestSubstring(s);
        System.out.println("Result: "+result);

    }
}
