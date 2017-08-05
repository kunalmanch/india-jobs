package com.kunal.practice.trees

import com.kunal.practice.BaseSpec
import com.kunal.practice.helpers.Node
import spock.lang.Unroll;

/**
 * Created by kunal on 7/11/2017.
 */
class LCATest extends BaseSpec {
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

    @Unroll
    void testDistanceNodes() {
        given:


        expect:
        LCA.distanceNodes(tree(), n1, n2) == exp

        where:
        exp << [2,4,3,1,5]
        n1 << [4,4,3,2,8]
        n2 << [5,6,4,4,5]

    }
}
