package com.kunal.practice.sort

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by kunal on 7/13/2017.
 */
class DuplicatesTest extends Specification {
    @Unroll
    void testInTwoArrays() {
        given:
        def a = listA as int[]
        def b = listB as int[]

        expect:
        Duplicates.inTwoArrays(a, b) == exp

        where:
        listA << [[1,2,3], [2,3,5]]
        listB << [[2,3,5], [1,2,3]]
        exp << [2, 2]
    }
}
