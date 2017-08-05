package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kunal on 7/13/2017.
 */
public class LevelOrder {

    public static void print(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int clevel = 1, nlevel = 0;
        while (!q.isEmpty()) {
            root = q.poll();
            System.err.print(root.val + " ");
            if (root.left != null) {
                q.add(root.left);
                nlevel++;
            }
            if (root.right != null) {
                q.add(root.right);
                nlevel++;
            }
            if (--clevel == 0) {
                System.err.println("");
                clevel = nlevel;
                nlevel = 0;
            }
        }
    }
}
