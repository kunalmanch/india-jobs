package com.kunal.practice.sort;

/**
 * Created by kunal on 7/18/2017.
 */
public class MergeSort {

    public static void sort(int[] a) {
        int[] tmp = new int[a.length];
        sort(a, tmp, 0, a.length - 1);
    }

    private static void sort(int[] a, int[] tmp, int lo, int hi) {
        if (lo >= hi) return;
        int mid = lo + ((hi - lo) >> 1);
        sort(a, tmp, lo, mid);
        sort(a, tmp, mid + 1, hi);
        merge(a, tmp, lo, mid, hi);
    }

    private static void merge(int[] a, int[] tmp, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        int k = lo;
        while (i <= mid && j <= hi) {
            if (a[i] < a[j]) {
                tmp[k] = a[i++];
            } else {
                tmp[k] = a[j++];
            }
            k++;
        }

        while (i <= mid) {
            tmp[k++] = a[i++];
        }

        while (j <= hi) {
            tmp[k++] = a[j++];
        }

        for (int idx = lo; idx <= hi; idx++) {
            a[idx] = tmp[idx];
        }
    }
}
