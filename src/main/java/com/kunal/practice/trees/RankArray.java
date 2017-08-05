package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

/**
 * Given an array, rank elements
 */
public class RankArray {

    public static int[] rank(int[] a) {
        Node root = null;
        for (int i = 0; i < a.length; i++) {
            root = addToBST(root, a[i], i);
        }
        int[] ranked = new int[a.length];
        inorder(root, ranked, new int[1]);
        return ranked;
    }

    private static Node addToBST(Node root, int val, int idx) {
        if (root == null) {
            root = new Node(val);
            root.idx = idx;
            return root;
        }
        else if (val < root.val) {
            root.left = addToBST(root.left, val, idx);
        } else {
            root.right = addToBST(root.right, val, idx);
        }
        return root;
    }

    private static void inorder(Node root, int[] ranked, int[] order) {
        if (root == null) return;
        inorder(root.left, ranked, order);
        ranked[root.idx] = order[0]++;
        inorder(root.right, ranked, order);
    }
}
