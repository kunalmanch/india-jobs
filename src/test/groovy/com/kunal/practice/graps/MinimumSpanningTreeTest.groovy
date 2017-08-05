package com.kunal.practice.graps

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/15/2017.
 */
class MinimumSpanningTreeTest extends BaseSpec {
    void testPrims() {
        given:
        def graph = [[0, 2, 0, 6, 0],
            [2, 0, 3, 8, 5],
            [0, 3, 0, 0, 7],
            [6, 8, 0, 0, 9],
            [0, 5, 7, 9, 0],
        ] as int[][]

        def exp = "0 - 0 : 0\r\n" +
                "0 - 1 : 2\r\n" +
                "1 - 2 : 3\r\n" +
                "0 - 3 : 6\r\n" +
                "1 - 4 : 5\r\n"

        MinimumSpanningTree.prims(graph, 0)

        expect:
        capture.toString() == exp
    }
}
