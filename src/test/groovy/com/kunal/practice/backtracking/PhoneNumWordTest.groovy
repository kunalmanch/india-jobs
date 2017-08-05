package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec
import spock.lang.Unroll

/**
 * Created by kunal on 7/12/2017.
 */
class PhoneNumWordTest extends BaseSpec {
    @Unroll
    void testWords() {
        given:
        def arr = list as int[]
        PhoneNumWord.words(arr, new char[arr.length], 0)

        expect:
        capture.toString() == exp

        where:
        exp << ['pt pu pv qt qu qv rt ru rv st su sv ',
                'daj dak dal dbj dbk dbl dcj dck dcl eaj eak eal ebj ebk ebl ecj eck ecl faj fak fal fbj fbk fbl fcj fck fcl ']
        list << [[7,8], [3,2,5]]


    }
}
