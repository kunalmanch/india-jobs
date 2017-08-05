package com.kunal.practice.backtracking;

/**
 * Given a set, print all combinations of N.
 */
public class CombinationN {

    public static void combinationN(int[] set, int[] a, int idx) {
        if (idx == a.length) {
            for (int i : a) System.err.print(i + " ");
            System.err.print(": ");
        } else if (idx < a.length) {
            for (int i = 0; i < set.length; i++) {
                a[idx] = set[i];
                combinationN(set, a, idx + 1);
            }
        }
    }
}
