package com.kunal.practice.trees

import com.kunal.practice.BaseSpec
import spock.lang.Unroll

/**
 * Created by kunal on 7/13/2017.
 */
class BSTTest extends BaseSpec {
    @Unroll
    void testFromSortedArray() {
        given:
        def arr = list as int[]
        def root = BST.fromSortedArray(arr, 0, arr.length - 1)
        LevelOrder.print(root)

        expect:
        root.val == expRoot
        capture.toString() == expTree
        BST.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) == true
        BST.isBSTInOrder(root) == true

        where:
        list << [[1,2,3,4,5,6,7]]
        expRoot << [4]
        expTree << ['4 \r\n2 6 \r\n1 3 5 7 \r\n']
    }
}
