package com.kunal.practice.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kunal on 7/16/2017.
 */
public class PascalsTriangle {

    public static void print(int k) {
        System.err.println("1");
        k--;
        List<Integer> prev = new ArrayList<>();
        while (k-- > 0) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int i = 1; i < prev.size(); i++) {
                curr.add(prev.get(i - 1) + prev.get(i));
            }
            curr.add(1);
            prev = curr;
            for (int i : curr) {
                System.err.print(i + " ");
            }
            System.err.println("");
        }
    }
}
