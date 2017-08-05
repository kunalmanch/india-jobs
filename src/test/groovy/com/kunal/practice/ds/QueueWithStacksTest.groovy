package com.kunal.practice.ds

import spock.lang.Specification

/**
 * Created by kunal on 7/14/2017.
 */
class QueueWithStacksTest extends Specification {

    def "queue with stacks"() {
        given:
        QueueWithStacks q = new QueueWithStacks()
        q.add(1)
        q.add(2)
        q.add(3)

        expect:
        q.poll() == 1
        q.poll() == 2
        q.poll() == 3
    }

    def "pop on empty queue"() {
        given:
        QueueWithStacks q = new QueueWithStacks()

        when:
        q.poll()

        then:
        thrown RuntimeException
    }
}
