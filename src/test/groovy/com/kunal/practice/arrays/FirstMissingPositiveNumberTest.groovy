package com.kunal.practice.arrays

import spock.lang.Specification

/**
 * Created by kunal on 7/20/2017.
 */
class FirstMissingPositiveNumberTest extends Specification {
    void testFind() {
        given:
        def a = [1,2,0] as int[]

        expect:
        FirstMissingPositiveNumber.find(a) == 3
    }
}
