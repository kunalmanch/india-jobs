package com.kunal.practice.slidingwindow

import spock.lang.Unroll

/**
 * Created by kunal on 7/12/2017.
 */
class StringSmallestWindowTest extends GroovyTestCase {

    @Unroll
    void testSelf() {

        expect:
        StringSmallestWindow.self("aabcbcdbca") == 4

    }
}
