package com.kunal.practice.arrays;

/**
 * Created by kunal on 7/8/2017.
 */
public class MaxDiff {

    public static int maxDiff(int[] a) {
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i] - min);
            min = Math.min(min, a[i]);
        }
        return max;
    }
}
