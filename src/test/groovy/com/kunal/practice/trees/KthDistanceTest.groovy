package com.kunal.practice.trees

import com.kunal.practice.BaseSpec
import com.kunal.practice.helpers.Node

/**
 * Created by kunal on 7/10/2017.
 */
class KthDistanceTest extends BaseSpec {
    
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
    
    def treeTwo() {
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
    
    void testKthDistanceNode() {
        given:
        def exp = '4 20 '
        def root = treeOne()
        def target = root.left.right
        KthDistance.kthDistance(root, target, 2)

        expect:
        capture.toString() == exp
    }
    
    void testKthDistanceLeafParents() {
        given:
        def exp = '1 3 '
        def root = treeTwo()
        KthDistance.kthDistanceLeaf(root, 2, 0, new boolean[20], new Node[20])

        expect:
        capture.toString() == exp
    }
}
