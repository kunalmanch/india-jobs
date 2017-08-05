package com.kunal.practice.binarysearch;

/**
 * Created by kunal on 7/17/2017.
 */
public class IncDec {
    // 6,7,8,9,5,4,3,2
    public static int max(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            if (lo == hi) return a[lo];
            if (hi - lo == 1) return Math.max(a[lo], a[hi]);

            int mid = lo + ((hi - lo) >> 1);
            if (a[mid] > a[mid -1] && a[mid] > a[mid + 1]) return a[mid];

            if (a[mid - 1] < a[mid] && a[mid] < a[mid + 1]) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
