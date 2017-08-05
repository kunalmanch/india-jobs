package com.kunal.practice.graps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by kunal on 7/15/2017.
 */
public class MinimumSpanningTree {

    public static void prims(int[][] g, int src) {
        class VD implements Comparable<VD> {
            int dist, idx;

            VD(int idx, int dist) {
                this.idx = idx;
                this.dist = dist;
            }

            @Override
            public int compareTo(VD that) {
                return this.dist - that.dist;
            }

        }

        Set<Integer> visited = new HashSet<>();
        int[] parents = new int[g.length];
        int[] dist = new int[g.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<VD> pq = new PriorityQueue<>();
        pq.add(new VD(src, 0));
        int count = 0;
        while (count++ < g.length) {
            VD u = pq.poll();
            visited.add(u.idx);
            for (int v = 0; v < g.length; v++) {
                if (!visited.contains(v) &&
                        g[u.idx][v] != 0 &&
                        dist[u.idx] != Integer.MAX_VALUE &&
                        g[u.idx][v] < dist[v]) {
                    dist[v] = g[u.idx][v];
                    parents[v] = u.idx;
                    pq.add(new VD(v, dist[v]));
                }
            }
        }
        printPrimsMST(g, parents, dist);
    }

    private static void printPrimsMST(int[][] g, int[] parents, int[] dist) {
        for (int i = 0; i < g.length; i++) {
            System.err.println(parents[i] + " - " + i + " : " + dist[i]);
        }
    }
}
