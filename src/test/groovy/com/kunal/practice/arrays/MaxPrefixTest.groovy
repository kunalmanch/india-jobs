package com.kunal.practice.arrays

import com.kunal.practice.Helpers
import spock.lang.Specification

/**
 * Created by kunal on 7/8/2017.
 */
class MaxPrefixTest extends Specification {

    def "max prefix"() {
        given:
        def arr = Helpers.toIntArray(list)

        expect:
        MaxPrefix.maxPrefix(arr) == expecetd

        where:
        list << [[10,-4,6,2,8,9,4], [10,9,1,2,3,4]]
        expecetd << [5, 3]
    }
}
