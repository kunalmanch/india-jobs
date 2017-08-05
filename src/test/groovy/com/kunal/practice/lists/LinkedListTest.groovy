package com.kunal.practice.lists

import spock.lang.Specification
import com.kunal.practice.helpers.Node;

/**
 * Created by kunal on 7/17/2017.
 */
class LinkedListTest extends Specification {
    void testCreate() {
        given:
        def arr = [1,2,3] as int[]
        Node head = LinkedList.create(arr)
        def str = LinkedList.toStr(head)

        expect:
        str == '1->2->3'
    }

    void testReverse() {
        given:
        def arr = [1,2,3] as int[]
        Node head = LinkedList.create(arr)
        Node revHead = LinkedList.reverse(head)
        def str = LinkedList.toStr(revHead)

        expect:
        str == '3->2->1'
    }

    void testRecurisveReverse() {
        given:
        def arr = [1,2,3] as int[]
        Node head = LinkedList.create(arr)
        Node revHead = LinkedList.recReverse(head)
        def str = LinkedList.toStr(revHead)

        expect:
        str == '3->2->1'
    }
}
