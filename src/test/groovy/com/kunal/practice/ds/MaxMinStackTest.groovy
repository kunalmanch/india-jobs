package com.kunal.practice.ds

import spock.lang.Specification

/**
 * Created by kunal on 7/14/2017.
 */
class MaxMinStackTest extends Specification {

    def "min max stack"() {
        given:
        MaxMinStack stack = new MaxMinStack()

        expect:
        stack.push(1)
        stack.max() == 1
        stack.min() == 1
        stack.push(5)
        stack.max() == 5
        stack.min() == 1
        stack.push(0)
        stack.max() == 5
        stack.min() == 0
        stack.pop() == 0;
        stack.min() == 1
        stack.max() == 5
        stack.pop() == 5
        stack.min() == 1
        stack.max() == 1
        stack.pop() == 1
    }

    def "pop when stack is empty"() {
        given:
        MaxMinStack stack = new MaxMinStack()

        when:
        stack.pop()
        stack.max()
        stack.min()

        then:
        thrown RuntimeException
    }
}
