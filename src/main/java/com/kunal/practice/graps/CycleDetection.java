package com.kunal.practice.graps;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kunal on 7/15/2017.
 */
public class CycleDetection {


    public static boolean cycleExists(int[][] g, int src) {
        return !isTopologicalSortPossible(g, src, new HashSet<>(), new ArrayDeque<>(), new HashSet<>());
    }

    public static void topologicalSort(int[][] g, int src) {
        Deque<Integer> stack = new ArrayDeque<>();
        boolean result = isTopologicalSortPossible(g, src, new HashSet<>(), stack, new HashSet<>());
        if (result) {
            while (!stack.isEmpty()) {
                System.err.print(stack.pop() + "->");
            }
            return;
        }
        throw new RuntimeException("cycle detected!");
    }

    private static boolean isTopologicalSortPossible(int[][] g,
                                                    int u,
                                                    Set<Integer> visited,
                                                    Deque<Integer> stack,
                                                    Set<Integer> recStacak) {
        if (!visited.contains(u)) {
            visited.add(u);
            recStacak.add(u);
            for (int v = 0; v < g.length; v++) {
                if (g[u][v] == 1) {
                    if (!visited.contains(v) && !isTopologicalSortPossible(g, v, visited, stack, recStacak)) {
                        return false;
                    } else if (recStacak.contains(v)) {
                        return false;
                    }
                }
            }
        }
        stack.push(u);
        recStacak.remove(u);
        return true;
    }
}
