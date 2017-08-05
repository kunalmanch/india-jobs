package com.kunal.practice.binarysearch;

/**
 * Created by kunal on 7/16/2017.
 */
public class TwoDMatrix {

    public static boolean rowColumnSortedFind(int[][] matrix, int t) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n - 1;
        while (r < m && c > -1) {
            if (matrix[r][c] == t) return true;
            if (t < matrix[r][c]) c--;
            else r++;
        }
        return false;
    }

    public static boolean strictSortFind(int[][] matrix, int t) {
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m * n;
        int lo = 0;
        int hi = total - 1;

        while (lo <= hi) {
            if (lo == hi) return get(matrix, lo) == t;
            if (hi - lo == 1) {
                if (get(matrix, lo) == t) return true;
                if (get(matrix, hi) == t) return true;
                return false;
            }

            int mid = lo + ((hi - lo) >> 1);
            int curr = get(matrix, mid);
            if (curr == t) return true;
            if (curr < t) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }

    private static int get(int[][] matrix, int idx) {
        int n = matrix[0].length;
        int r = idx / n;
        int c = idx % n;
        return matrix[r][c];
    }
}
