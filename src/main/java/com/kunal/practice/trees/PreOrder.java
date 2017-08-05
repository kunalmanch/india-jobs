package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by kunal on 7/11/2017.
 */
public class PreOrder {

    public static void nonRecursive(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            System.err.print(root.val + " ");
            if (root.right != null) stack.push(root.right);
            if (root.left != null) stack.push(root.left);
        }
    }
}
