package com.kunal.practice.sort;

/**
 * Created by kunal on 7/13/2017.
 */
public class Duplicates {

    public static int inTwoArrays(int[] a, int[] b) {
        int i = 0, j = 0, count = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else if (a[i] > b[j]) j++;
            else i++;
        }
        return count;
    }

}
