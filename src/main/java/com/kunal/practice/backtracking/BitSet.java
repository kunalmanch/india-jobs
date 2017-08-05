package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/8/2017.
 */
public class BitSet {

    public static void bitset(char a[], int idx) {
        if (idx == a.length) {
            System.err.print(new String(a) + ":");
        } else if (idx < a.length) {
            a[idx] = '0';
            bitset(a, idx + 1);
            a[idx] = '1';
            bitset(a, idx + 1);
        }
    }
}
