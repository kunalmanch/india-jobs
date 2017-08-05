package com.kunal.practice.arrays

import com.kunal.practice.Helpers
import spock.lang.Specification

/**
 * Created by kunal on 7/8/2017.
 */
class MissingElementTest extends Specification {
    void testMissing() {
        given:
        def arr = Helpers.toIntArray(list)

        expect:
        expected == MissingElement.missing(arr, n)

        where:
        list << [[1,2,4], [1,2,3,5]]
        n << [4, 5]
        expected << [3, 4]
    }
}
