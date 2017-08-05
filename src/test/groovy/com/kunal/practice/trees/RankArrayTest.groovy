package com.kunal.practice.trees

import spock.lang.Specification

/**
 * Created by kunal on 7/17/2017.
 */
class RankArrayTest extends Specification {
    void testRank() {
        given:
        def arr = list as int[]
        def expArr = exp as int[]

        expect:
        RankArray.rank(arr) == expArr

        where:
        list << [[30,40,10]]
        exp << [[1,2,0]]
    }
}
