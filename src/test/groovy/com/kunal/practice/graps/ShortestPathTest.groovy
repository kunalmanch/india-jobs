package com.kunal.practice.graps

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/15/2017.
 */
class ShortestPathTest extends BaseSpec {
    void testDjikstra() {
        given:
        def graph = [
            [0, 4, 0, 0, 0, 0, 0, 8, 0],
            [4, 0, 8, 0, 0, 0, 0, 11, 0],
            [0, 8, 0, 7, 0, 4, 0, 0, 2],
            [0, 0, 7, 0, 9, 14, 0, 0, 0],
            [0, 0, 0, 9, 0, 10, 0, 0, 0],
            [0, 0, 4, 0, 10, 0, 2, 0, 0],
            [0, 0, 0, 14, 0, 2, 0, 1, 6],
            [8, 11, 0, 0, 0, 0, 1, 0, 7],
            [0, 0, 2, 0, 0, 0, 6, 7, 0]
        ] as int[][]
        ShortestPath.djikstra(graph, 0)

        def exp = "vertex 0 distance 0\r\n" +
                "vertex 1 distance 4\r\n" +
                "vertex 2 distance 12\r\n" +
                "vertex 3 distance 19\r\n" +
                "vertex 4 distance 21\r\n" +
                "vertex 5 distance 11\r\n" +
                "vertex 6 distance 9\r\n" +
                "vertex 7 distance 8\r\n" +
                "vertex 8 distance 14\r\n"

        expect:
        capture.toString() == exp
    }

    def "ug shortest path count"() {
        given:
        def graph = [
                [0,1,1,1,0],
                [1,0,0,0,1],
                [1,0,0,0,1],
                [1,0,0,0,1],
                [0,1,1,1,0]
        ] as int[][]

        expect:
        ShortestPath.shortestPathsCountUG(graph, 0, 4) == 3
    }
}
