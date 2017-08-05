package com.kunal.practice.slidingwindow;

/**
 * Returns length of smallest subarray with sum greater than x.
 * If there is no subarray with given sum, then returns n+1
 */
public class SmallestSubArrayWGTSum {

    public static int minLength(int[] a, int t) {
        int minLength = a.length + 1;
        int s = 0, sum = a[0];
        for (int i = 1; i <= a.length; i++) {
            while (sum > t && s < i) {
                minLength = Math.min(minLength, i - s); // no +1 because e is post incremented.
                sum -= a[s++];
            }
            if (i < a.length) {
                sum += a[i];
            }
        }
        return minLength;
    }
}
