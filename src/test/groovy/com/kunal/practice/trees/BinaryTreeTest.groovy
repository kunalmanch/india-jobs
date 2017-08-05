package com.kunal.practice.trees

import com.kunal.practice.BaseSpec
import com.kunal.practice.helpers.Node

/**
 * Created by kunal on 7/11/2017.
 */
class BinaryTreeTest extends BaseSpec {

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
        root.right = new Node(2)
        root.left.left = new Node(3)
        root.left.right = new Node(4)
        root.right.left = new Node(4)
        root.right.right = new Node(3)
        return root
    }

    def "binary tree to inorder list"() {
        given:
        BinarytoList(treeOne())
        def head = Binaryhead
        def itr = head
        while (itr != null) {
            System.err.print(itr.val + "->")
            itr = itr.right
        }
        def exp = '4->8->10->12->14->20->22->'

        expect:
        head.val == 4
        capture.toString() == exp
    }

    def "binary tree is symmetric"() {
        expect:
        BinaryTree.isSymmetric(treeTwo(), treeTwo()) == true
    }

    def "count leaves and nodes"() {
        expect:
        BinaryTree.countNodes(treeTwo()) == 7
        BinaryTree.countLeaves(treeTwo()) == 4
    }
    
    def "children sum"() {
        given:
        Node root = new Node(10)
        root.left = new Node(8)
        root.left.right = new Node(5)
        root.left.left = new Node(3)
        root.right = new Node(2)
        root.right.left = new Node(2)

        expect:
        BinaryTree.childrenSum(root) == true
    }

    def "print leaves' paths"() {
        given:
        BinaryTree.printLeafPath(treeOne(), "")

        expect:
        capture.toString() == '20->8->4|20->8->12->10|20->8->12->14|20->22|'
    }
}
