package com.kunal.practice.arrays;

/**
 * Created by kunal on 7/8/2017.
 */
public class MissingElement {

    /**
     * array of length n and elements in range [1..n], find the missing element.
     * @param a
     * @return
     */
    public static int missing(int[] a, int n) {
        int x = a[0];
        for (int i = 1; i < a.length; i++) x ^= a[i];
        int y = 1;
        for (int i = 2; i <= n; i++) y ^= i;
        return x ^ y;
    }
}
