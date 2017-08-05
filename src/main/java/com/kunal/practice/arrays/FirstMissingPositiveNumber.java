package com.kunal.practice.arrays;

/**
 * Created by kunal on 7/20/2017.
 */
public class FirstMissingPositiveNumber {

    public static int find(int[] a) {
        for (int i = 0; i < a.length; i++) {
            while (a[i] > 0 && a[i] <= a.length && a[a[i] - 1] != a[i]) {
                int t = a[i];
                a[i] = a[a[i] - 1]; // if a[i] = 5, swap 5 with a[4]
                a[a[i] - 1] = t;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != i + 1) return i + 1;
        }

        return -1;
    }
}
