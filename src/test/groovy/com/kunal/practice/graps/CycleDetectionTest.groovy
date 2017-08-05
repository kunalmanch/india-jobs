package com.kunal.practice.graps

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/15/2017.
 */
class CycleDetectionTest extends BaseSpec {
    void testCycleExists() {
        given:
        def graph = [
                [0,1,0,0,0],
                [0,0,1,0,0],
                [0,0,0,1,0],
                [1,0,0,0,1],
                [0,0,0,0,0]
        ] as int[][]

        expect:
        CycleDetection.cycleExists(graph, 0) == true
    }

    void "topological sort"() {
        given:
        def graph = [
                [0,1,1,1,0],
                [0,0,0,0,1],
                [0,0,0,0,1],
                [0,0,0,0,1],
                [0,0,0,0,0]
        ] as int[][]
        CycleDetection.topologicalSort(graph, 0)
        def exp = '0->3->2->1->4->'

        expect:
        capture.toString() == exp
    }
}
