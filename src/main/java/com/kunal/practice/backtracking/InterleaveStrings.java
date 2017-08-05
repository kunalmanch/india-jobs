package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/8/2017.
 */
public class InterleaveStrings {

    public static void interleave(String a, String b, int i, int y, char[] ch, int idx) {
        if (idx == ch.length) {
            System.err.print(new String(ch) + " ");
        } else if (idx < ch.length) {
            if (i < a.length()) {
                ch[idx] = a.charAt(i);
                interleave(a, b, i + 1, y, ch, idx + 1);
            }
            if (y < b.length()) {
                ch[idx] = b.charAt(y);
                interleave(a, b, i, y + 1, ch, idx + 1);
            }
        }
    }
}
