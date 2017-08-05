package com.kunal.practice.slidingwindow

import com.kunal.practice.BaseSpec
import spock.lang.Unroll

/**
 * Created by kunal on 7/12/2017.
 */
class SubArraySumTest extends BaseSpec {
    @Unroll
    void testExists() {
        given:
        def arr = list as int[]

        expect:
        SubArraySum.exists(arr, t) == exp

        where:
        t << [33, 7, 0, 2]
        list << [[1, 4, 20, 3, 10, 5], [1, 4, 0, 0, 3, 10, 5], [1, 4], [1,1,1]]
        exp << [true, true, false, true]
    }
}
