package com.kunal.practice.ds;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by kunal on 7/14/2017.
 */
public class StackWithQs {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackWithQs() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("stack is empty");
        int size = q1.size() - 1;
        for (int i = 0; i < size; i++) {
            q2.add(q1.poll());
        }
        int popped = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }
}
