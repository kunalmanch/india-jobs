package com.kunal.practice.binarysearch

import spock.lang.Specification

/**
 * Created by kunal on 7/17/2017.
 */
class BinarySearchTest extends Specification {
    void testExists() {
        given:
        def a = [1,2,3,4,5] as int[]

        expect:
        BinarySearch.exists(a, 1) == true
        BinarySearch.exists(a, 2) == true
        BinarySearch.exists(a, 3) == true
        BinarySearch.exists(a, 5) == true
        BinarySearch.exists(a, 4) == true
        BinarySearch.exists(a, 0) == false
        BinarySearch.exists(a, 6) == false
    }
}
