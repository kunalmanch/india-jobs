package com.kunal.practice.backtracking;

/**
 * Created by kunal on 7/13/2017.
 */
public class OrderedPairing {

    public static void orderedPairs(String s, String pre) {
        System.err.print(pre + '(' +  s + ")|");
        for (int i = 1; i < s.length(); i++) {
            String tempPre = pre + '(' + s.substring(0, i) + ')';
            orderedPairs(s.substring(i), tempPre);
        }
    }
}
