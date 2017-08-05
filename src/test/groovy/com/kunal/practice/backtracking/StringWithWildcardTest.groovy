package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/8/2017.
 */
class StringWithWildcardTest extends BaseSpec {
    void testCombinations() {
        given:
        def expected = '01000 01001 01010 01011 01100 01101 01110 01111 '
        StringWithWildcard.combinations('01???', new char[5], 0)

        expect:
        capture.toString() == expected
    }
}
