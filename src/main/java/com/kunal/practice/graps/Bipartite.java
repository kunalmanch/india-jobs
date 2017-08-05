package com.kunal.practice.graps;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * Created by kunal on 7/15/2017.
 */
public class Bipartite {

    public static boolean isBipartite(int[][] G, int src) {
        Queue<Integer> q = new ArrayDeque<>();
        int[] colors = new int[G.length];
        Arrays.fill(colors, -1);
        colors[src] = 1;
        q.add(src);

        while (!q.isEmpty()) {
            int u = q.poll();

            if (G[u][u] == 1) return false;

            for (int v = 0; v < G.length; v++) {
                if (G[u][v] == 1) {
                    if (colors[v] == -1) {
                        colors[v] = 1 - colors[u];
                        q.add(v);
                    } else if (colors[v] == colors[u]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
