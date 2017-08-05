package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

/**
 * Created by kunal on 7/18/2017.
 */
public class MaxPathSum {
    /**
     * between leaves only
     * @param root tree node
     * @param res the final result
     * @return the max root->leaf sum
     */
    public static int maxLeafPathSum(Node root, int[] res) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;

        int ls = maxLeafPathSum(root.left, res);
        int rs = maxLeafPathSum(root.right, res);

        if (root.left != null && root.right != null) {
            res[0] = Math.max(res[0], ls + rs + root.val);

            return Math.max(ls + root.val, rs + root.val);
        }

        return root.left != null ? ls + root.val : rs + root.val;
    }

    /**
     * between any nodes
     * @return
     */
    public static int maxSum(Node root, int[] res) {
        if (root == null) return 0;

        int ls = maxSum(root.left, res);
        int rs = maxSum(root.right, res);

        int maxWithOneChild = Math.max(Math.max(ls, rs) + root.val, root.val);
        res[0] = Math.max(res[0], Math.max(ls + rs + root.val, maxWithOneChild));
        return maxWithOneChild;
    }
}
