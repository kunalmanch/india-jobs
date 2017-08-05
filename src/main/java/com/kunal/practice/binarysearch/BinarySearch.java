package com.kunal.practice.binarysearch;

/**
 * Created by kunal on 7/17/2017.
 */
public class BinarySearch {

    public static boolean exists(int[] a, int t) {
        if (a == null || a.length == 0) return false;
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            if (lo == hi) return a[lo] == t;
            if (hi - lo == 1) {
                if (a[lo] == t) return true;
                else return a[hi] == t;
            }

            int mid = lo + ((hi - lo) >> 1);
            if (a[mid] == t) return true;
            if (a[mid] > t) hi = mid - 1;
            else lo = mid + 1;
        }
        return false;
    }
}
