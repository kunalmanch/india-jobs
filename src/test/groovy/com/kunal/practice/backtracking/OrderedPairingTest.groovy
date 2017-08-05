package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/13/2017.
 */
class OrderedPairingTest extends BaseSpec {
    void testOrderedPairs() {
        given:
        def exp = '(1234)|(1)(234)|(1)(2)(34)|(1)(2)(3)(4)|(1)(23)(4)|(12)(34)|(12)(3)(4)|(123)(4)|'
        OrderedPairing.orderedPairs("1234", "")

        expect:
        capture.toString() == exp

    }
}
