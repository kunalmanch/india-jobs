package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

/**
 * Created by kunal on 7/10/2017.
 */
public class LCA {

    public static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.val == n1 || root.val == n2) {
            return root;
        }

        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        if (leftLCA != null && rightLCA != null) return root;

        return leftLCA != null ? leftLCA : rightLCA;
    }

    public static void distFromRoot(Node root, int target, int d, int[] dist) {
        if (root == null) return;

        if (root.val == target) {
            dist[0] = d;
            return;
        }

        distFromRoot(root.left, target, d + 1, dist);
        distFromRoot(root.right, target, d + 1, dist);
    }

    /**
     * Given two nodes, find the distance between them.
     * @param n1
     * @param n2
     * @return
     */
    public static int distanceNodes(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int[] d1 = new int[1];
        int[] d2 = new int[1];
        int[] d3 = new int[1];
        distFromRoot(root, n1, 0, d1);
        distFromRoot(root, n2, 0, d2);
        distFromRoot(root, lca.val, 0, d3);

        return d1[0] + d2[0] - 2 * d3[0];
    }
}
