package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/8/2017.
 */
public class StringWithWildcard {

    public static void combinations(String s, char[] a, int idx) {
        if (a.length == idx) {
            System.err.print(new String(a) + " ");
        } else if (idx < a.length) {
            if (s.charAt(idx) == '?') {
                a[idx] = '0';
                combinations(s, a, idx + 1);
                a[idx] = '1';
                combinations(s, a, idx + 1);
            } else {
                a[idx] = s.charAt(idx);
                combinations(s, a, idx + 1);
            }
        }
    }
}
