package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/13/2017.
 */
public class StringSetCombination {

    public static void combine(char[] a, char[] out, int idx) {
        if (idx == out.length) {
            System.err.print(new String(out) + "|");
        } else if (idx < out.length) {
            for (char ch : a) {
                out[idx] = ch;
                combine(a, out,idx + 1);
            }
        }
    }

    public static int countStrings(int len, int bfreq, int cfreq, int idx) {
        int count = 0;
        if (len == idx) return 1;
        if (idx < len) {
            if (bfreq > 0) {
                count += countStrings(len, bfreq - 1, cfreq, idx + 1);
            }
            if (cfreq > 0) {
                count += countStrings(len, bfreq, cfreq - 1, idx + 1);
            }
            count += countStrings(len, bfreq, cfreq, idx + 1);
        }
        return count;
    }

}
