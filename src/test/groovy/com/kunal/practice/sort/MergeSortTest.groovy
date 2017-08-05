package com.kunal.practice.sort

import spock.lang.Specification

/**
 * Created by kunal on 7/18/2017.
 */
class MergeSortTest extends Specification {

    void testQuickSort() {
        given:
        def arr = [1,5,4,3,2] as int[]
        MergeSort.sort(arr)

        expect:
        arr == [1,2,3,4,5] as int[]
    }
}
