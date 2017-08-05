package com.kunal.practice.sort

import spock.lang.Specification

/**
 * Created by kunal on 7/18/2017.
 */
class NsqSortsTest extends Specification {
    void testSelectionSort() {
        given:
        def arr = [1,5,4,3,2] as int[]
        NsqSorts.selectionSort(arr)

        expect:
        arr == [1,2,3,4,5] as int[]
    }

    def "bubble sort"() {
        given:
        def arr = [1,5,4,3,2] as int[]
        NsqSorts.bubbleSort(arr)

        expect:
        arr == [1,2,3,4,5] as int[]
    }

    def "ins sort"() {
        given:
        def arr = [1,5,4,3,2] as int[]
        NsqSorts.insertionSort(arr)

        expect:
        arr == [1,2,3,4,5] as int[]
    }
}
