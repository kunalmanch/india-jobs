package com.kunal.practice.trees

import com.kunal.practice.BaseSpec
import spock.lang.Specification
import com.kunal.practice.helpers.Node


/**
 * Created by kunal on 7/8/2017.
 */
class ViewsTest extends BaseSpec {

    def treeOne() {
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
    
    def treeTwo() {
        def root = new Node(20)
        root.left = new Node(8)
        root.right = new Node(22)
        root.left.left = new Node(5)
        root.left.right = new Node(3)
        root.right.left = new Node(4)
        root.right.right = new Node(25)
        root.left.right.left = new Node(10)
        root.left.right.right = new Node(14)
        return root
    }

    def treeThree() {
        Node root              = new Node(20)
        root.left              = new Node(8)
        root.left.left         = new Node(4)
        root.left.right        = new Node(12)
        root.left.right.left   = new Node(10)
        root.left.right.right  = new Node(14)
        root.right             = new Node(22)
        root.right.right       = new Node(25)
        return root;
    }
    
    def "left view"() {
        setup:
        def list = []
        int[] maxLevel = new int[1]
        Views.sideView(treeOne(), list, maxLevel, 1, true)

        expect:
        list == [1,2,4,8]
    }

    def "right view"() {
        setup:
        def list = []
        int[] maxLevel = new int[1]
        Views.sideView(treeOne(), list, maxLevel, 1, false)

        expect:
        list == [1,3,7,8]
    }

    def "bottom view"() {
        setup:
        def list = Views.bottomView(treeTwo())

        expect:
        list == [5, 10, 4, 14, 25]
    }

    def "periphery view"() {
        given:
        Views.peripheralView(treeThree())
        def exp = '20 8 4 10 14 25 22 '

        expect:
        capture.toString() == exp
    }
}
