package com.kunal.practice.arrays

import com.kunal.practice.Helpers
import spock.lang.Specification

/**
 * Created by kunal on 7/8/2017.
 */
class EqualSumsTest extends Specification {
    void testFindIdxs() {
        given:
        def arr = Helpers.toIntArray(list)

        expect:
        EqualSums.findIdxs(arr) == expected

        where:
        list << [[-1, 3, -4, 5, 1, -6, 2, 1]]
        expected << ['1,3,7']

    }
}
