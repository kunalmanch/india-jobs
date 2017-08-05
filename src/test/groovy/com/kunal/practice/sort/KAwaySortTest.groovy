package com.kunal.practice.sort

import spock.lang.Specification

/**
 * Created by kunal on 7/18/2017.
 */
class KAwaySortTest extends Specification {
    void testKSortPQ() {
        given:
        def arr = [1,5,4,3,2] as int[]
        KAwaySort.kSortPQ(arr, 4)

        expect:
        arr == [1,2,3,4,5] as int[]
    }

    void testKSortBubble() {
        given:
        def arr = [1,5,4,3,2] as int[]
        KAwaySort.kSortBubble(arr, 4)

        expect:
        arr == [1,2,3,4,5] as int[]
    }
}
