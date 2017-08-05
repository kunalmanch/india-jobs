package com.kunal.practice.slidingwindow

import com.kunal.practice.BaseSpec
import spock.lang.Unroll

/**
 * Created by kunal on 7/12/2017.
 */
class MaxInKWindowTest extends BaseSpec {
    @Unroll
    void testMaxInK() {
        given:
        def arr = list as int[]
        MaxInKWindow.maxInK(arr, k)

        expect:
        capture.toString() == exp

        where:
        k << [3, 4]
        list << [[1, 2, 3, 1, 4, 5, 2, 3, 6], [8, 5, 10, 7, 9, 4, 15, 12, 90, 13]]
        exp << ["3 3 4 5 5 5 6 ", "10 10 10 15 15 90 90 "]
    }
}
