package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/8/2017.
 */
class BitSetTest extends BaseSpec {

    void testBitset() {
        given:
        def expected = '000:001:010:011:100:101:110:111:'
        BitSet.bitset(new char[3], 0)

        expect:
        capture.toString() == expected
    }
}
