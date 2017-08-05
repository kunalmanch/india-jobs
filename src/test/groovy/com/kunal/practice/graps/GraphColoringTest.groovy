package com.kunal.practice.graps

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/15/2017.
 */
class GraphColoringTest extends BaseSpec {
    void testColor() {
        given:
        def graph = [[0, 1, 1, 1],
                     [1, 0, 1, 0],
                     [1, 1, 0, 1],
                     [1, 0, 1, 0]] as int[][]
        int m = 3
        def exp = '1|2|3|2|'

        expect:
        GraphColoring.color(graph, m) == true
        capture.toString() == exp
    }
}

