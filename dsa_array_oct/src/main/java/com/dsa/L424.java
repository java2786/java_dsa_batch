package com.dsa;

public class L424 {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int windowSize = 0;
        int maxFreq = 0;

        for(int right=0;right<s.length();right++){
            int index = s.charAt(right) - 'A';
            freq[index]++;

            maxFreq = Math.max(maxFreq, freq[index]);
            int wl = right - left + 1;
            if(wl - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            wl = right - left + 1;
            windowSize = Math.max(windowSize, wl);
        }

        return windowSize;
    }
}