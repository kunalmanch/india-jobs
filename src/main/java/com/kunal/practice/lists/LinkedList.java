package com.kunal.practice.lists;

import com.kunal.practice.helpers.Node;

/**
 * Created by kunal on 7/17/2017.
 */
public class LinkedList {

    public static Node create(int[] a) {
        Node head = null, prev = null;
        for (int i = 0; i < a.length; i++) {
            Node t = new Node(a[i]);
            if (prev == null) {
                head = t;
            } else {
                prev.next = t;
            }
            prev = t;
        }
        return head;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node t = head.next;
            head.next = prev;
            prev = head;
            head = t;
        }
        return prev;
    }

    public static Node recReverse(Node head) {
        if (head == null) return null; //base
        if (head.next == null) return head; //last node, hence new head
        Node second = head.next;//'1->2', this is '2'
        head.next = null;//'1->null'
        Node reverseRest = recReverse(second);//reverse everything second onwards
        second.next = head;//'2->1'
        return reverseRest;
    }

    public static String toStr(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            sb.append("->");
            head = head.next;
        }
        sb.setLength(sb.length() - 2);
        return sb.toString();
    }
}
