package com.kunal.practice.ds

import spock.lang.Specification

/**
 * Created by kunal on 7/14/2017.
 */
class StackWithQsTest extends Specification {

    def "stack with queues"() {
        given:
        StackWithQs stack = new StackWithQs()
        stack.push(1)
        stack.push(2)
        stack.push(3)

        expect:
        stack.pop() == 3
        stack.pop() == 2
        stack.pop() == 1
    }
}
