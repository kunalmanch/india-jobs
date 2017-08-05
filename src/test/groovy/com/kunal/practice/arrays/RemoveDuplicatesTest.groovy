package com.kunal.practice.arrays

import spock.lang.Specification

/**
 * Created by kunal on 7/18/2017.
 */
class RemoveDuplicatesTest extends Specification {
    void testRemoveDuplicates() {
        given:
        def a = [1,2,2,3,3] as int[]

        expect:
        RemoveDuplicates.removeDuplicates(a) == 3
    }
}
