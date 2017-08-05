package com.kunal.practice.trees

import com.kunal.practice.BaseSpec
import com.kunal.practice.helpers.Node

/**
 * Created by kunal on 7/11/2017.
 */
class PreOrderTest extends BaseSpec {
    def treeOne() {
        Node root = new Node(20)
        root.left = new Node(8)
        root.right = new Node(22)
        root.left.left = new Node(4)
        root.left.right = new Node(12)
        root.left.right.left = new Node(10)
        root.left.right.right = new Node(14)
        return root
    }
    void testNonRecursive() {
        given:
        def exp = '20 8 4 12 10 14 22 '
        PreOrder.nonRecursive(treeOne())

        expect:
        capture.toString() == exp
    }
}
