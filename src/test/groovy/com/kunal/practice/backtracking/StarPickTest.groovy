package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec


/**
 * Created by kunal on 7/8/2017.
 */
class StarPickTest extends BaseSpec {

    def "starpick"() {
        given:
        def expected = '*** **c *b* *bc a** a*c ab* abc '
        def arr = ['a', 'b', 'c'] as char[]
        StarPick.starPick(arr, new boolean[3], 0)

        expect:
        capture.toString() == expected
    }
}
