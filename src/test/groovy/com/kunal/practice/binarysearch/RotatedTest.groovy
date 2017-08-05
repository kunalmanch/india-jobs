package com.kunal.practice.binarysearch

import spock.lang.Specification

/**
 * Created by kunal on 7/17/2017.
 */
class RotatedTest extends Specification {
    void testMin() {
        expect:
        Rotated.min([3,4,5,6,7,1,2] as int[]) == 1
    }

    void testSearch() {
        given:
        def a = [3,4,5,6,7,1,2] as int[]

        expect:
        Rotated.search(a, 1) == 5
        Rotated.search(a, 7) == 4
        Rotated.search(a, 6) == 3
        Rotated.search(a, 4) == 1
        Rotated.search(a, 11) == -1
    }
}
