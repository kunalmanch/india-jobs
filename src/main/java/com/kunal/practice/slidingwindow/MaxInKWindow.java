package com.kunal.practice.slidingwindow;

import java.util.LinkedList;

/**
 * Created by kunal on 7/12/2017.
 */
public class MaxInKWindow {

    public static void maxInK(int[] a, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!list.isEmpty() && a[list.getLast()] < a[i]) {
                list.removeLast();
            }

            list.addLast(i);
        }

        for (int i = k; i < a.length; i++) {
            System.err.print(a[list.getFirst()] + " ");

            while (!list.isEmpty() && list.getFirst() < i - k + 1) {
                list.removeFirst();
            }

            while (!list.isEmpty() && a[list.getLast()] < a[i]) {
                list.removeLast();
            }

            list.addLast(i);
        }
        System.err.print(a[list.getFirst()] + " ");
    }
}
