package com.kunal.practice.arrays;

import com.kunal.practice.helpers.Node;

/**
 * Given an array, return the max number of elements greater than an index in the array
 * where these elements are on the right side of this index
 */
public class MaxPrefix {

    public static int maxPrefix(int[] arr) {
        int max = 0;
        Node root = null;
        for (int i = arr.length - 1, prefix = 0; i >= 0; i--, prefix = 0) {
            if (i == arr.length - 1) {
                root = new Node(arr[i]);
                continue;
            }
            Node itr = root;
            Node node = new Node(arr[i]);
            while (true) {
                if (itr.val == node.val) break;
                if (node.val < itr.val) {
                    itr.leftCount++;
                    prefix += itr.rightCount + 1; //+1 for the itr node.
                    if (itr.left == null) {
                        itr.left = node;
                        break;
                    }
                    itr = itr.left;
                } else {
                    itr.rightCount++;
                    if (itr.right == null) {
                        itr.right = node;
                        break;
                    }
                    itr = itr.right;
                }
            }
            max = Math.max(max, prefix);
        }
        return max;
    }
}
