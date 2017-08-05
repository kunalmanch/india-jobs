package com.kunal.practice.trees

import spock.lang.Specification
import com.kunal.practice.helpers.Node

/**
 * Created by kunal on 7/18/2017.
 */
class MaxPathSumTest extends Specification {
    void testMaxLeafPathSum() {
        given:
        Node root = new Node(-15)
        root.left = new Node(5)
        root.right = new Node(6)
        root.left.left = new Node(-8)
        root.left.right = new Node(1)
        root.left.left.left = new Node(2)
        root.left.left.right = new Node(6)
        root.right.left = new Node(3)
        root.right.right = new Node(9)
        root.right.right.right = new Node(0)
        root.right.right.right.left = new Node(4)
        root.right.right.right.right = new Node(-1)
        root.right.right.right.right.left = new Node(10)
        def res = new int[1]
        MaxPathSum.maxLeafPathSum(root, res)

        expect:
        res[0] == 27
    }

    def "max sum any nodes"() {
        given:
        Node root = new Node(10)
        root.left = new Node(2)
        root.right = new Node(10)
        root.left.left = new Node(20)
        root.left.right = new Node(1)
        root.right.right = new Node(-25)
        root.right.right.left = new Node(3)
        root.right.right.right = new Node(4)
        def res = new int[1]
        MaxPathSum.maxSum(root, res)

        expect:
        res[0] == 42
    }
}
