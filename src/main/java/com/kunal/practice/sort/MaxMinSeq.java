package com.kunal.practice.sort;

/**
 * Given an ascendingly sorted array, transponse it into a max min sequence.
 */
public class MaxMinSeq {

    public static int[] maxmin(int[] a) {
        int[] ans = new int[a.length];
        int s = 0, e = a.length - 1;
        int p = 0 ;
        while (s < e) {
            ans[p++] = a[e--];
            ans[p++] = a[s++];
        }
        if (a.length % 2 != 0) {
            ans[p] = a[s];
        }
        return ans;
    }
}
