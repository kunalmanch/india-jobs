package com.kunal.practice.graps

import spock.lang.Specification

/**
 * Created by kunal on 7/15/2017.
 */
class BipartiteTest extends Specification {
    void testIsBipartite() {
        given:
        int[][] g = [[0, 1, 0, 1],
            [1, 0, 1, 0],
            [0, 1, 0, 1],
            [1, 0, 1, 0]] as int[][]

        expect:
        Bipartite.isBipartite(g, 0) == true
    }
}
