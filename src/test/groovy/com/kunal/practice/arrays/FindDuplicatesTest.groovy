package com.kunal.practice.arrays

import com.kunal.practice.Helpers
import spock.lang.Specification

/**
 * Created by kunal on 7/8/2017.
 */
class FindDuplicatesTest extends Specification {

    def "find duplicate when arr of n in range[1..n]"() {
        given:
        def arr = Helpers.toIntArray(list)

        expect:
        FindDuplicates.find(arr) == expected

        where:
        list << [[1,3,4,2,2]]
        expected << [2]
    }
}
