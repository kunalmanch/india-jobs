package com.kunal.practice.binarysearch;

/**
 * Created by kunal on 7/17/2017.
 */
public class Rotated {

    public static int min(int[] a) {
        if (a == null || a.length == 0) throw new RuntimeException("empty array");
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            if (lo == hi) return a[lo];
            if (lo - hi == -1) return Math.min(a[lo], a[hi]);

            if (a[lo] < a[hi]) return a[lo];

            int mid = lo + ((hi - lo) >> 1);
            if (a[mid] > a[hi]) lo = mid;
            else hi = mid;
        }
        return -1;
    }

    public static int search(int[] a, int t) {
        if (a == null || a.length == 0) throw new RuntimeException("empty array");
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            if (lo == hi) return a[lo] == t ? lo : -1;
            if (hi - lo == 1) return (t == a[lo] ? lo : (t == a[hi] ?  hi : -1));

            int mid = lo + ((hi - lo) >> 1);
            if (a[mid] == t) return mid;

            if (a[lo] <= a[mid]) { //if lo...mid is sorted
                if (a[lo] <= t && t < a[mid]) hi = mid - 1;
                else lo = mid + 1;
            } else {
                if (a[mid] < t && t <= a[hi]) lo = mid + 1; //if mid....hi is sorted
                else hi = mid - 1;
            }
        }
        return -1;
    }
}
