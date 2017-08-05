package com.kunal.practice.graps;

/**
 * Created by kunal on 7/15/2017.
 */
public class GraphColoring {

    public static boolean color(int[][] G, int colorCount) {
        int[] colors = new int[G.length];

        if (!canBeColored(G, colors, colorCount, 0)) {
            return false;
        }

        printSoln(colors);
        return true;
    }

    private static boolean canBeColored(int[][] g, int[] colors, int colorCount, int u) {
        if (u == g.length) return true;

        for (int c = 1; c <= colorCount; c++) {
            if (isColorSafe(g, colors, u, c)) {
                colors[u] = c;
                if (canBeColored(g, colors, colorCount, u + 1)) return true;
                colors[u] = 0;
            }
        }
        return false;
    }

    private static boolean isColorSafe(int[][] g, int[] colors, int u, int color) {
        for (int v = 0; v < g[u].length; v++) {
            if (g[u][v] == 1 && colors[v] == color) return false;
        }
        return true;
    }

    private static void printSoln(int[] colors) {
        for (int i : colors) {
            System.err.print(i + "|");
        }
    }
}
