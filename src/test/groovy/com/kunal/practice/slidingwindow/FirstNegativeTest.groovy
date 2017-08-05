package com.kunal.practice.slidingwindow

import com.kunal.practice.BaseSpec
import spock.lang.Unroll

/**
 * Created by kunal on 7/12/2017.
 */
class FirstNegativeTest extends BaseSpec {
    @Unroll
    void testFirstNegative() {
        given:
        def arr = list as int[]
        FirstNegative.firstNegative(arr, k)

        expect:
        capture.toString() == exp

        where:
        k << [2, 3]
        list << [[-8, 2, 3, -6, 10], [12, -1, -7, 8, -15, 30, 16, 28]]
        exp << ["-8 0 -6 -6 ", "-1 -1 -7 -15 -15 0 "]
    }
}
