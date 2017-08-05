package com.kunal.practice.graps;

import java.util.*;

/**
 * Created by kunal on 7/15/2017.
 */
public class ShortestPath {
    /**
     * shortest path from a source to all vertices in a graph.
     */
    public static void djikstra(int[][] g, int src) {
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
                        dist[u.idx] + g[u.idx][v] < dist[v]) {
                    dist[v] = dist[u.idx] + g[u.idx][v];
                    pq.add(new VD(v, dist[v]));
                }
            }
        }
        printDijkstra(dist);
    }

    private static void printDijkstra(int[] dist) {
        for (int i = 0; i < dist.length; i++) {
            System.err.println("vertex " + i + " distance " + dist[i]);
        }
    }

    public static int shortestPathsCountUG(int[][] g, int src, int dest) {
        class VD {
            int dist, idx;

            VD(int idx, int dist) {
                this.idx = idx;
                this.dist = dist;
            }
        }

        boolean found = false;
        int count = 0;
        Set<Integer> visited = new HashSet<>();
        Queue<VD> q = new ArrayDeque<>();
        q.add(new VD(src, 0));
        int shortest = 0;
        while (!q.isEmpty()) {
            VD u = q.poll();
            visited.add(u.idx);
            if (u.idx == dest) {
                if (found) {
                    if (u.dist == shortest) count++;
                } else {
                    found = true;
                    shortest = u.dist;
                    count++;
                }
                continue;
            }
            for (int v = 0; v < g.length; v++) {
                if (!visited.contains(v) && g[u.idx][v] == 1) {
                    q.add(new VD(v, u.dist + 1));
                }
            }
        }
        return count;
    }
}
