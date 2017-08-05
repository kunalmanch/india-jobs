package com.kunal.practice.trees

import spock.lang.Specification

/**
 * Created by kunal on 7/19/2017.
 */
class SegmentTreeTest extends Specification {
    void testSum() {
        given:
        def a = [1,3,5,7,9,11] as int[]
        SegmentTree st = new SegmentTree(a)

        expect:
        st.sum(0, 4) == 25
        st.update(0, 5)
        st.sum(0, 4) == 29
    }
}
