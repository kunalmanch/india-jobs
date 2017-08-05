package com.kunal.practice.sort;

/**
 * Created by kunal on 7/18/2017.
 */
public class QuickSortAndSelect {

    public static int kSmallest(int[] a, int k) {
        if (k > a.length) throw new RuntimeException("invalid k");
        return quickSelect(a, 0, a.length - 1, k);
    }

    private static int quickSelect(int[] a, int lo, int hi, int k) {
        if (lo == hi) return a[lo];
        int pivot = partition(a, lo, hi);
        if (pivot == k) return a[k];
        if (pivot > k) return quickSelect(a, lo, pivot - 1, k);
        else return quickSelect(a, pivot + 1, hi, k);
    }

    public static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int lo, int hi) {
        if (lo < hi) {
            int p = partition(a, lo, hi);
            quickSort(a, lo, p - 1);
            quickSort(a, p + 1, hi);
        }
    }

    private static int partition(int[] a, int lo, int hi) {
        int i = lo;
        int pivot = a[hi];
        for (int j = i; j < hi; j++) {
            if (a[j] < pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, hi);
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
