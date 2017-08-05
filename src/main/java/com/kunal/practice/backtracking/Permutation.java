package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/13/2017.
 */
public class Permutation {

    public static void permute(char[] a, int lo, int hi) {
        if (lo == hi) {
            System.err.print(new String(a) + "|");
        } else if (lo < hi) {
            for (int i = lo; i < hi; i++) {
                swap(a, lo, i);
                permute(a, lo + 1, hi);
                swap(a, lo, i);
            }
        }
    }

    private static void swap(char[] a, int lo, int i) {
        char t = a[lo];
        a[lo] = a[i];
        a[i] = t;
    }
}
