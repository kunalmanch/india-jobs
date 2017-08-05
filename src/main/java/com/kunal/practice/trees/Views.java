package com.kunal.practice.trees;

import com.kunal.practice.helpers.Node;

import java.util.*;

/**
 * Created by kunal on 7/8/2017.
 */
public class Views {

    public static void sideView(Node root, List<Integer> list, int[] maxLevel, int level, boolean leftView) {
        if (root == null) return;

        if (maxLevel[0] < level) {
            list.add(root.val);
            maxLevel[0] = level;
        }

        Node first = root.right;
        Node second = root.left;
        if (leftView) {
            first = root.left;
            second = root.right;
        }

        sideView(first, list, maxLevel, level + 1, leftView);
        sideView(second, list, maxLevel, level + 1, leftView);
    }

    public static List<Integer> bottomView(Node root) {
        class NodeDist {
            int dist;
            Node node;

            NodeDist(int dist, Node node) {
                this.dist = dist;
                this.node = node;
            }
        }
        Map<Integer, Integer> distMap = new HashMap<>();
        Queue<NodeDist> q = new LinkedList<>();
        NodeDist nodeDist = new NodeDist(0, root);
        q.add(nodeDist);
        int max = 0, min = 0;
        while (!q.isEmpty()) {
            nodeDist = q.poll();
            Node node = nodeDist.node;
            distMap.put(nodeDist.dist, node.val);
            if (node.left != null) {
                NodeDist left = new NodeDist(nodeDist.dist - 1, node.left);
                q.add(left);
                min = Math.min(left.dist, min);
            }

            if (node.right != null) {
                NodeDist right = new NodeDist(nodeDist.dist + 1, node.right);
                q.add(right);
                max = Math.max(right.dist, max);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(distMap.get(i));
        }
        return list;
    }

    /**
     * print all the peripheral nodes in counter clock wise.
     * @param root
     */
    public static void peripheralView(Node root) {
        if (root != null) {
            System.err.print(root.val + " ");
            Set<Node> printed = new HashSet<>();
            printLeftPeriphery(root, printed);
            printLeaves(root, printed);
            printRightPeriphery(root, printed);
        }
    }

    private static void printRightPeriphery(Node root, Set<Node> printed) {
        if (root == null) return;

        if (root.right != null && !printed.contains(root.right)) {
            printRightPeriphery(root.right, printed);
            System.err.print(root.right.val + " ");
            printed.add(root.right);
        } else if (root.left != null && !printed.contains(root.left)) {
            System.err.print(root.left.val + " ");
            printed.add(root.left);
            printRightPeriphery(root.left, printed);
        }
    }

    private static void printLeaves(Node root, Set<Node> printed) {
        if (root == null) return;

        printLeaves(root.left, printed);

        if (root.left == null && root.right == null && !printed.contains(root)) {
            System.err.print(root.val + " ");
            printed.add(root);
        }

        printLeaves(root.right, printed);
    }

    private static void printLeftPeriphery(Node root, Set<Node> printed) {
        if (root == null) return;

        if (root.left != null) {
            System.err.print(root.left.val + " ");
            printed.add(root.left);
            printLeftPeriphery(root.left, printed);
        } else if (root.right != null) {
            System.err.print(root.right.val + " ");
            printed.add(root.right);
            printLeftPeriphery(root.right, printed);
        }
    }
}
