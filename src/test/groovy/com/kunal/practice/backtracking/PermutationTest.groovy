package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/13/2017.
 */
class PermutationTest extends BaseSpec {
    void testPermute() {
        given:
        def a = "abc".toCharArray()
        Permutation.permute(a, 0, a.length)
        def exp = 'abc|acb|bac|bca|cba|cab|'

        expect:
        capture.toString() == exp
    }
}
