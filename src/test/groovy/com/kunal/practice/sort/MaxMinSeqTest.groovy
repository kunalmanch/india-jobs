package com.kunal.practice.sort

import com.kunal.practice.BaseSpec
import spock.lang.Unroll

/**
 * Created by kunal on 7/13/2017.
 */
class MaxMinSeqTest extends BaseSpec {
    @Unroll
    void testMaxmin() {
        given:
        def arr = list as int[]

        expect:
        MaxMinSeq.maxmin(arr) == exp

        where:
        exp << [[9,1,8,2,7,3,6,4,5], [8,1,7,2,6,3,5,4]]
        list << [[1,2,3,4,5,6,7,8,9], [1,2,3,4,5,6,7,8]]
    }
}
