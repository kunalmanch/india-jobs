package com.kunal.practice.arrays;

/**
 * Created by kunal on 7/20/2017.
 */
public class MaxSubarray {

    public static int sum(int[] a) {
        int maxSoFar = a[0];
        int maxHere = a[0];
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            maxHere = Math.max(x, x + maxHere);
            maxSoFar = Math.max(maxHere, maxSoFar);
        }
        return maxSoFar;
    }

    public static int product(int[] a) {
        int maxSoFar = a[0];
        int minHere = a[0];
        int maxHere = a[0];
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            if (x > 0) {
                maxHere = Math.max(x, x * maxHere);
                minHere = Math.min(x, x * minHere);
            } else {
                maxHere = Math.max(x, x * minHere);
                minHere = Math.max(x, x * maxHere);
            }
            maxSoFar = Math.max(maxSoFar, maxHere);
        }
        return maxSoFar;
    }
}
