package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/8/2017.
 */
public class SumN {

    public static void sumN(int[] a, boolean[] b, int idx, int n) {
        if (n == 0) {
            for (int i = 0; i < a.length; i++) {
                if (b[i]) System.err.print(a[i] + ",");
            }
            System.err.print("|");
        } else if (idx < a.length) {
            b[idx] = true;
            sumN(a, b, idx + 1, n - a[idx]);
            b[idx] = false;
            sumN(a, b, idx + 1, n);
        }
    }


    public static void sumNInRange(int n, String out) {
        if (n == 0) {
            System.err.print(out + '|');
        } else {
            for (int i = 1; i <= n; i++) {
                sumNInRange(n - i, out + " " + i);
            }
        }
    }
}
