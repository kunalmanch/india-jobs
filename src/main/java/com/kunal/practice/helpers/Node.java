package com.kunal.practice.helpers;

/**
 * This is a multi-utility node that keeps int value and can be used in a tree or a list.
 */
public class Node {

    public int val;

    //array mapping
    public int idx;

    //tree specific members
    public Node left;
    public Node right;
    public int leftCount;
    public int rightCount;
    public int order;

    //list specific members
    public Node next;
    public Node prev;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}
