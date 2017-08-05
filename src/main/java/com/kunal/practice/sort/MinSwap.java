package com.kunal.practice.sort;

import java.util.Arrays;

/**
 * Created by kunal on 7/18/2017.
 */
public class MinSwap {

    /**
     * Given an unsorted array, find the minmum number of swaps needed to sort the array.
     * @param a
     * @return
     */
    public static int minSwaps(int[] a) {
        class Node implements Comparable<Node> {
            int idx, val;
            Node(int idx, int val) {
                this.idx = idx;
                this.val = val;
            }

            @Override
            public int compareTo(Node that) {
                return this.val - that.val;
            }
        }
        Node[] nodes = new Node[a.length];
        for (int i = 0; i < a.length; i++) {
            nodes[i] = new Node(i, a[i]);
        }
        Arrays.sort(nodes);
        boolean[] visited = new boolean[a.length];
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {
            if (visited[i] || nodes[i].idx == i) continue;

            int j = i;
            int cycleSize = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = nodes[j].idx;
                cycleSize++;
            }
            swaps += cycleSize - 1;
        }
        return swaps;
    }

}
