package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class KthDistance {

    /**
     * Find all nodes that are kth distance away from a given node.
     * @param root
     * @param target
     * @param k
     */
    public static void kthDistance(Node root, Node target, int k) {
        Queue<Node> ancestors = new LinkedList<>();
        findAncestors(root, target, ancestors);

        Node parent = null;
        while (!ancestors.isEmpty() && k > -1) {
            Node ancestor = ancestors.poll();
            if (k == 0) {
                System.err.print(ancestor.val + " ");
            }
            if (parent == null) {
                printkDistanceDown(ancestor, k); //the target node
            } else if (ancestor.left == parent) {
                printkDistanceDown(ancestor.right, k - 1);
            } else {
                printkDistanceDown(ancestor.left, k - 1);
            }
            k--;
            parent = ancestor;
        }
    }

    private static void printkDistanceDown(Node root, int k) {
        if (root == null) return;

        if (k == 0) {
            System.err.print(root.val + " ");
            return;
        }

        printkDistanceDown(root.left, k - 1);
        printkDistanceDown(root.right, k - 1);
    }

    private static boolean findAncestors(Node root, Node target, Queue<Node> q) {
        if (root == null || target == null) {
            return false;
        }
        if (root == target) {
            q.add(root);
            return true;
        }
        if (findAncestors(root.left, target, q) || findAncestors(root.right, target, q)) {
            q.add(root);
            return true;
        }

        return false;
    }

    /**
     * Find nodes at k distance from leaf.
     * @param root
     * @param k
     */
    public static void kthDistanceLeaf(Node root, int k, int pathlen, boolean[] visited, Node[] ancestors) {
        if (root == null) return;

        ancestors[pathlen++] = root;

        if (root.left == null && root.right == null && !visited[pathlen - k - 1]) {
            visited[pathlen - k - 1] = true;
            System.err.print(ancestors[pathlen - k - 1] + " ");
            return;
        }

        kthDistanceLeaf(root.left, k, pathlen, visited, ancestors);
        kthDistanceLeaf(root.right, k, pathlen, visited, ancestors);
    }
}
