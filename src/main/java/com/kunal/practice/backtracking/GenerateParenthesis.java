package com.kunal.practice.backtracking;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 */
public class GenerateParenthesis {

    public static void generate(char a[], int idx, int left, int right) {
        if (left < right) {
            return;
        }
        if (left == right && right == a.length / 2) {
            System.err.print(new String(a) + ":");
        } else if (idx < a.length) {
            if (left < a.length / 2) {
                a[idx] = '(';
                generate(a, idx + 1, left + 1, right);
            }
            if (right < a.length / 2) {
                a[idx] = ')';
                generate(a, idx + 1, left, right + 1);
            }
        }
    }
}
