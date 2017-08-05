package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by kunal on 7/11/2017.
 */
public class Inorder {

    public static void nonRecursive(Node root) {
        boolean notDone = true;
        Deque<Node> stack = new ArrayDeque<>();
        while (notDone) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else if (!stack.isEmpty()) {
                root = stack.pop();
                System.err.print(root.val + " ");
                root = root.right;
            } else {
                notDone = false;
            }
        }
    }
}
