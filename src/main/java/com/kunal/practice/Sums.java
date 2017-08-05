package com.kunal.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kunal on 7/12/2017.
 */
public class Sums {

    public static int[] twosum(int[] ar, int t) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        for (int i : ar) {
           if (set.contains(t - i)) {
               ans[0] = t - i;
               ans[1] = i;
           } else {
               set.add(i);
           }
        }
        return ans;
    }

    public static int closestTwoSum(int[] ar, int t) {
        Arrays.sort(ar);
        int i = 0;
        int j = ar.length - 1;
        int min = Integer.MAX_VALUE;
        while (i < j) {
            int sum = ar[i] + ar[j];
            if (sum == t) {
                return sum;
            }
            if (Math.abs(sum - t) < min) {
                min = Math.abs(sum - t);
            }
            if (sum > t) j--;
            else i++;
        }
        return min;
    }

    public static int[] threesum(int[] a, int t) {
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            int k = a.length - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == t) {
                    return new int[]{a[i], a[j], a[k]};
                }
                if (sum > t) k--;
                else j++;
            }
        }
        return new int[3];
    }
}
