package com.kunal.practice.arrays

import com.kunal.practice.Helpers
import spock.lang.Specification

/**
 * Created by kunal on 7/8/2017.
 */
class MaxDiffTest extends Specification {
    def "max diff"() {
        given:
        def arr = Helpers.toIntArray(list)

        expect:
        MaxDiff.maxDiff(arr) == expected

        where:
        list <<[[80, 2, 6, 3, 100]]
        expected << [98]

    }
}
