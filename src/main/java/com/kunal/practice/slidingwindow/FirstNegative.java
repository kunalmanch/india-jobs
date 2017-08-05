package com.kunal.practice.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Find first negative number in window of size k.
 */
public class FirstNegative {

    public static void firstNegative(int[] a, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            if (a[i] < 0) list.addLast(i);
        }

        for (int i = k; i < a.length; i++) {
            System.err.print((list.isEmpty() ?  0 : a[list.getFirst()]) + " ");

            while (!list.isEmpty() && list.getFirst() < i - k + 1) {
                list.removeFirst();
            }

            if (a[i] < 0) list.addLast(i);
        }
        System.err.print((list.isEmpty() ?  0 : a[list.getFirst()]) + " ");
    }

}
