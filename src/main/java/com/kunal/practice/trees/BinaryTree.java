package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

import static com.kunal.practice.trees.Height.height;

/**
 * Created by kunal on 7/11/2017.
 */
public class BinaryTree {

    /**
     * convert a binary tree into a inorder list
     */
    static Node prev, head;
    public static void toList(Node root) {
        if (root == null) return;
        toList(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        toList(root.right);
    }

    public static boolean isSymmetric(Node r1, Node r2) {
        if (r1 == null && r2 == null) return true;
        if (r1 == null || r2 == null) return false;

        return r1.val == r2.val &&
                isSymmetric(r1.left, r2.right) &&
                isSymmetric(r1.right, r2.left);
    }

    public static int diameter(Node root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        int ld = diameter(root.left);
        int rd = diameter(root.right);

        return Math.max(1 + lh + rh, Math.max(ld, rd));
    }

    public static boolean isBalanced(Node root) {
        if (root == null) return true;

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        return Math.abs(lHeight - rHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static int countLeaves(Node root) {
        if (root == null) return 0;

        return (root.left == null && root.right == null ? 1 : 0) +
                countLeaves(root.left) +
                countLeaves(root.right);
    }

    public static boolean childrenSum(Node root) {
        if (root == null || (root.left == null && root.right == null)) return true;
        int l = root.left != null ? root.left.val : 0;
        int r = root.right != null ? root.right.val : 0;
        return (root.val == l + r) &&
                childrenSum(root.left) &&
                childrenSum(root.right);
    }

    public static void printLeafPath(Node root, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.err.print(s + root.val + "|");
            return;
        }
        printLeafPath(root.left, s + root.val + "->");
        printLeafPath(root.right, s + root.val + "->");
    }
}
