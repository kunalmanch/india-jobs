package com.kunal.practice.slidingwindow

import com.kunal.practice.BaseSpec
import spock.lang.Unroll

/**
 * Created by kunal on 7/12/2017.
 */
class SmallestSubArrayWGTSumTest extends BaseSpec {

    @Unroll
    void testMinLength() {
        given:
        def arr = list as int[]

        expect:
        SmallestSubArrayWGTSum.minLength(arr, t) == exp

        where:
        t << [51, 9, 280, 8]
        list << [[1, 4, 45, 6, 0, 19], [1, 10, 5, 2, 7], [1, 11, 100, 1, 0, 200, 3, 2, 1, 250], [1, 2, 4]]
        exp << [3, 1, 4, 4]
    }
}
