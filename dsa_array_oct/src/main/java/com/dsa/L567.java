package com.dsa;

import java.util.Arrays;

public class L567 {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int[] first = new int[26];
        int[] second = new int[26];

        int k = s1.length();

        for(char c:s1.toCharArray()){
            first[c-'a']++;
        }
        // 1 1 0 0 0 0 0 0 ......


        for(int i=0;i<s2.length();i++){
            second[s2.charAt(i)-'a']++;

            if(i>=k){
                second[s2.charAt(i-k)-'a']--;
            }


            if(Arrays.equals(first, second)){
                return true;
            }
        }
return false;
    }
}
