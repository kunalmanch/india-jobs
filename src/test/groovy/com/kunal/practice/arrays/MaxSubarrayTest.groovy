package com.kunal.practice.arrays

import spock.lang.Specification

/**
 * Created by kunal on 7/20/2017.
 */
class MaxSubarrayTest extends Specification {
    void testSum() {
        given:
        def a = [-2,1,-3,4,-1,2,1,-5,4] as int[]

        expect:
        MaxSubarray.sum(a) == 6
    }

    def "maximum subarray product"() {
        given:
        def a = [2,3,-2,4] as int[]

        expect:
        MaxSubarray.product(a) == 6
    }
}
