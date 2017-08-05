package com.kunal.practice.trees

import com.kunal.practice.BaseSpec
import com.kunal.practice.helpers.Node

/**
 * Created by kunal on 7/10/2017.
 */
class HeightTest extends BaseSpec {

    def tree() {
        Node root = new Node(1)
        root.left = new Node(2)
        root.right = new Node(3)
        root.left.left = new Node(4)
        root.left.right = new Node(5)
        root.right.left = new Node(6)
        root.right.right = new Node(7)
        root.right.left.right = new Node(8)
        return root
    }

    void testHeight() {
        given:
        def exp = 4
        def actual = Height.height(tree())

        expect:
        actual == exp
    }

    def testIsBalanced() {
        given:
        def actual = BinaryTree.isBalanced(tree())

        expect:
        actual == true
    }

    def "min depth"() {
        expect:
        Height.minHeight(tree()) == 3
    }
}
