package com.kunal.practice.slidingwindow;

/**
 * Given a target find a sub-array whose sum is equal to target.
 */
public class SubArraySum {

    public static boolean exists(int[] a, int t) {
        int sum = a[0];
        int start = 0;
        int count = 0;
        for (int i = 1; i <= a.length; i++) {
            while (sum > t && start < i - 1) {
                sum -= a[start++];
            }
            if (sum == t) {
                count++;
                return true;
            }
            if (i < a.length) {
                sum += a[i];
            }
        }
        return false;
    }
}
