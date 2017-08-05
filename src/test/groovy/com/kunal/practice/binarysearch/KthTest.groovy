package com.kunal.practice.binarysearch

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/10/2017.
 */
class KthTest extends BaseSpec {

    def "kth element"() {
        given:
        def arr1 = [1,12,13] as int[]
        def arr2 = [2,5,15] as int[]

        expect:
        Kth.findKth(k, arr1, arr2, 0, 0) == expK

        where:
        expK << [2, 5, 12, 15]
        k << [2, 3, 4, 6]
    }
}
