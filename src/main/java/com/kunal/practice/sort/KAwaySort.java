package com.kunal.practice.sort;

import java.util.PriorityQueue;

/**
 * Elements in an array are atmost k places away from their sorted position.
 */
public class KAwaySort {

    public static void kSortPQ(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while (i < k) {
            pq.add(a[i++]);
        }
        while (i < a.length) {
            a[i - k] = pq.poll();
            pq.add(a[i++]);
        }
        while (!pq.isEmpty()) {
            a[i - k] = pq.poll();
            i++;
        }
    }

    public static void kSortBubble(int[] a, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
    }

}
