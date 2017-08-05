package com.kunal.practice.slidingwindow;

/**
 * Find the max sum in a sub-array of size k.
 */
public class MaxSumSubArr {

    public static int maxSubArray(int[] a, int k) {
        int sum = 0;
        int maxSum;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        maxSum = sum;

        for (int i = k; i < a.length; i++) {
            sum += a[i] - a[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
