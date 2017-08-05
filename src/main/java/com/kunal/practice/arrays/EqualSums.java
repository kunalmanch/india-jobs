package com.kunal.practice.arrays;

/**
 * Find indexes where leftsum == rightsum
 */
public class EqualSums {

    public static String findIdxs(int[] a) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        int leftsum = 0;
        for (int i = 0; i < a.length; i++) {
            if (sum - a[i] - leftsum == leftsum) {
                if (sb.length() != 0) sb.append(',');
                sb.append(i);
            }
            leftsum += a[i];
        }
        return sb.toString();
    }
}
