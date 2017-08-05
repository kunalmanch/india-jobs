package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/13/2017.
 */
public class I18N {

    public static void i18n(String s, int i, int j, boolean[][] dp) {
        if (i >= j) return;
        if (dp[i][j]) return;
        dp[i][j] = true;
        System.err.print(s.substring(0, i) + (j - i) + s.substring(j) + "|");
        i18n(s, i + 1, j , dp);
        i18n(s, i, j - 1, dp);
    }
}
