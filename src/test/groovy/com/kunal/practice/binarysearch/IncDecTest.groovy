package com.kunal.practice.binarysearch

import spock.lang.Specification

/**
 * Created by kunal on 7/17/2017.
 */
class IncDecTest extends Specification {
    void testMax() {
        given:
        def a = [6,7,8,9,5,4,3,2] as int[]
        
        expect:
        IncDec.max(a) == 9
    }
}
