package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/8/2017.
 */
class SumNTest extends BaseSpec {

    def "sum n"() {
        given:
        def exp = '1,2,4,|2,5,|3,4,|'
        def arr = [1,2,3,4,5] as int[]
        SumN.sumN(arr, new boolean[5], 0, 7)

        expect:
        capture.toString() == exp
    }

    def "sum n in range[1..n]"() {
        given:
        def exp = ' 1 1 1 1 1 1 1| 1 1 1 1 1 2| 1 1 1 1 2 1| 1 1 1 1 3| 1 1 1 2 1 1| 1 1 1 2 2| 1 1 1 3 1| 1 1 1 4| 1 1 2 1 1 1| 1 1 2 1 2| 1 1 2 2 1| 1 1 2 3| 1 1 3 1 1| 1 1 3 2| 1 1 4 1| 1 1 5| 1 2 1 1 1 1| 1 2 1 1 2| 1 2 1 2 1| 1 2 1 3| 1 2 2 1 1| 1 2 2 2| 1 2 3 1| 1 2 4| 1 3 1 1 1| 1 3 1 2| 1 3 2 1| 1 3 3| 1 4 1 1| 1 4 2| 1 5 1| 1 6| 2 1 1 1 1 1| 2 1 1 1 2| 2 1 1 2 1| 2 1 1 3| 2 1 2 1 1| 2 1 2 2| 2 1 3 1| 2 1 4| 2 2 1 1 1| 2 2 1 2| 2 2 2 1| 2 2 3| 2 3 1 1| 2 3 2| 2 4 1| 2 5| 3 1 1 1 1| 3 1 1 2| 3 1 2 1| 3 1 3| 3 2 1 1| 3 2 2| 3 3 1| 3 4| 4 1 1 1| 4 1 2| 4 2 1| 4 3| 5 1 1| 5 2| 6 1| 7|'
        SumN.sumNInRange(7, "")

        expect:
        capture.toString() == exp
    }

}
