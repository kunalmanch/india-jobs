package com.kunal.practice.arrays;

/**
 * Created by kunal on 7/18/2017.
 */
public class RemoveDuplicates {
    /**
     * remove duplicates from a sorted array
     * @param a
     * @return
     */
    public static int removeDuplicates(int[] a) {
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                a[++i] = a[j];
            }
        }
        return i + 1;
    }
}
