package com.kunal.practice.ds;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by kunal on 7/14/2017.
 */
public class MaxMinStack {

    private LinkedList<Integer> elements;
    private LinkedList<Integer> maxList;
    private LinkedList<Integer> minList;

    public MaxMinStack() {
        elements = new LinkedList<>();
        maxList = new LinkedList<>();
        minList = new LinkedList<>();
    }

    public void push(int x) {
        int max = maxList.isEmpty() ? x : Math.max(maxList.getLast(), x);
        int min = minList.isEmpty() ? x : Math.min(minList.getLast(), x);
        maxList.addLast(max);
        minList.addLast(min);
        elements.addLast(x);
    }

    public int pop() {
        if (elements.isEmpty()) throw new RuntimeException("stack is empty");
        maxList.removeLast();
        minList.removeLast();
        int popped = elements.removeLast();
        return popped;
    }

    public int max() {
        if (elements.isEmpty()) throw new RuntimeException("stack is empty");
        return maxList.getLast();
    }

    public int min() {
        if (elements.isEmpty()) throw new RuntimeException("stack is empty");
        return minList.getLast();
    }
}
