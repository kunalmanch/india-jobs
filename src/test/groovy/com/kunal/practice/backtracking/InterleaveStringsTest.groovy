package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/8/2017.
 */
class InterleaveStringsTest extends BaseSpec {
    def "interleaved strings"() {
        given:
        def expected = 'abcd acbd acdb cabd cadb cdab '
        InterleaveStrings.interleave("ab", "cd", 0, 0, new char[4], 0)

        expect:
        capture.toString() == expected
    }
}
