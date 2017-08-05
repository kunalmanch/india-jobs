package com.kunal.practice.sort;

/**
 * Created by kunal on 7/18/2017.
 */
public class NsqSorts {

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = i; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    idx = j;
                }
            }
            int t = a[i];
            a[i] = a[idx];
            a[idx] = t;
        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    int t = a[j];
                    a[j] = a[j -1];
                    a[j - 1] = t;
                }
            }
        }
    }

    public static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }
}
