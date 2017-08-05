package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/13/2017.
 */
class StringSetCombinationTest extends BaseSpec {
    void testCountStrings() {
        expect:
        StringSetCombination.countStrings(3, 1, 2, 0) == 19
    }

    def testCombine() {
        expect:
        StringSetCombination.combine("abc".toCharArray(), new char[3], 0)
        capture.toString() == 'aaa|aab|aac|aba|abb|abc|aca|acb|acc|baa|bab|bac|bba|bbb|bbc|bca|bcb|bcc|caa|cab|cac|cba|cbb|cbc|cca|ccb|ccc|'
    }
}
