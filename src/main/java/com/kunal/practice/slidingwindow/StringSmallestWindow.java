package com.kunal.practice.slidingwindow;

import java.util.Arrays;

/**
 * Created by kunal on 7/12/2017.
 */
public class StringSmallestWindow {

    public static int self(String str) {
        int[] freq = new int[256];
        int distint = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 0) distint++;
            freq[str.charAt(i)]++;
        }
        Arrays.fill(freq, 0);
        int min = str.length() + 1;
        for (int e = 0, s = 0, count = 0; e < str.length(); e++) {
            if (freq[str.charAt(e)] == 0) {
                count++;
            }
            freq[str.charAt(e)]++;

            if (count == distint) {
                while (freq[str.charAt(s)] > 1) {
                    freq[str.charAt(s)]--;
                    s++;
                }
                min = Math.min(min, e - s + 1);
            }
        }
        return min;
    }
}
