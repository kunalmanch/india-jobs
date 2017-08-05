package com.kunal.practice.arrays;

/**
 * Created by kunal on 7/8/2017.
 */
public class FindDuplicates {

    /**
     * Given an array of length n and elements in the range [1,n],
     * find the duplicate element.
     */
    public static int find(int[] a) {
        for (int i : a) {
            if (a[Math.abs(i)] < 0) return Math.abs(i);
            a[Math.abs(i)] *= -1;
        }
        return -1;
    }
}
