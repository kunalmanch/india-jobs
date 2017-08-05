package com.kunal.practice.sort

import spock.lang.Specification

/**
 * Created by kunal on 7/18/2017.
 */
class MinSwapTest extends Specification {

    def "min swaps to sort an array"() {
        given:
        def arr = [1,5,4,2,3] as int[]

        expect:
        MinSwap.minSwaps(arr) == 3
    }
}
