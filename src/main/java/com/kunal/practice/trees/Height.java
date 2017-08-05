package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

/**
 * Created by kunal on 7/10/2017.
 */
public class Height {

    public static int height(Node root) {
        if (root == null) return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int minHeight(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        if (root.left == null) return 1 + minHeight(root.right);
        if (root.right == null) return 1 + minHeight(root.left);

        return 1 + Math.min(minHeight(root.left), minHeight(root.right));
    }
}
