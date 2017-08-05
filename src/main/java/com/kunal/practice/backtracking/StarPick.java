package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/8/2017.
 */
public class StarPick {

    public static void starPick(char[] a, boolean[] b, int idx){
        if (idx == a.length) {
            for (int i = 0; i < a.length; i++) {
                System.err.print(b[i] ? '*' : a[i]);
            }
            System.err.print(" ");
        } else if (idx < a.length) {
            b[idx] = true;
            starPick(a, b, idx + 1);
            b[idx] = false;
            starPick(a, b, idx + 1);
        }
    }
}
