package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int k = p.length();

        if(k>s.length()){
            return list;//[]
        }
        int[] first = new int[26]; // 0 - a, 1 - b, 2 - c, ....
        int[] second = new int[26];
        // abc
        for(int i=0;i<k;i++){
            // System.out.println((int)p.charAt(i) - 97);
            // System.out.println(p.charAt(i) - 'a');

            // c - a => 
            // 99 - 97 => 2
            first[p.charAt(i) - 'a'] = first[p.charAt(i) - 'a']+1;
            // System.out.println(first[p.charAt(i) - 'a']);
        }


        for(int i=0;i<s.length();i++){
            second[s.charAt(i) - 'a'] = second[s.charAt(i) - 'a']+1;
            if(i >= k){
                // first
                // 0 1 2 3
                second[s.charAt(i-k) - 'a']--;
            }

            if(Arrays.equals(first, second)){
                System.out.println("Same at: "+i);
                list.add(i-k+1);
            } else {
                System.out.println("Not Same at: "+i);
            }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println("********");
        }

        return list;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";// 0,6
        // String s = "abba", p = "ab";// 0,2
        System.err.println(findAnagrams(s, p));
    }
}
