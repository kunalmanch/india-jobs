package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec
import com.kunal.practice.Helpers

/**
 * Created by kunal on 7/8/2017.
 */
class CombinationNTest extends BaseSpec {
    void testCombinationN() {
        given:
        def expected = '2 2 : 2 3 : 2 4 : 3 2 : 3 3 : 3 4 : 4 2 : 4 3 : 4 4 : '
        CombinationN.combinationN(Helpers.toIntArray([2,3,4]), new int[2], 0)

        expect:
        capture.toString() == expected
    }
}
