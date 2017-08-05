package com.kunal.practice.ds;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by kunal on 7/14/2017.
 */
public class QueueWithStacks {

    private Deque<Integer> stack1 = new ArrayDeque<>();
    private Deque<Integer> stack2 = new ArrayDeque<>();

    public void add(int x) {
        stack1.push(x);
    }

    public int poll() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) throw new RuntimeException("queue is empty");
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
