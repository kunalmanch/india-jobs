package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

/**
 * Created by kunal on 7/10/2017.
 */
public class BST {

    public static boolean isBST(Node root, int left, int right) {
        if (root == null) return true;

        if (left >= root.val || root.val >= right) return false;

        return isBST(root.left, left, root.val) && isBST(root.right, root.val, right);
    }

    private static Node prev = null;

    public static boolean isBSTInOrder(Node root) {
        if (root == null) return true;

        if (!isBSTInOrder(root.left)) return false;

        if (prev != null && root.val <= prev.val) return false;

        prev = root;

        return isBSTInOrder(root.right);
    }



    public static Node fromSortedArray(int[] a, int start, int end) {
        if (start < 0 || start > end || end > a.length) return null;
        int mid = start + ((end - start) >> 1);
        Node node = new Node(a[mid]);
        node.left = fromSortedArray(a, start, mid - 1);
        node.right = fromSortedArray(a, mid + 1, end);
        return node;
    }
}
