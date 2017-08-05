package com.kunal.practice.slidingwindow

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/12/2017.
 */
class MaxSumSubArrTest extends BaseSpec {
    void testMaxSubArray() {
        given:
        def ar = arr as int[]

        expect:
        MaxSumSubArr.maxSubArray(ar, k) == exp

        where:
        k << [4, 2]
        exp << [39, 700]
        arr << [[1, 4, 2, 10, 23, 3, 1, 0, 20], [100, 200, 300, 400]]
    }
}
