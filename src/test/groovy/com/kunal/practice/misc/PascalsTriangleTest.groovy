package com.kunal.practice.misc

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/16/2017.
 */
class PascalsTriangleTest extends BaseSpec {
    void testPrint() {
        given:
        PascalsTriangle.print(5)
        def exp = '1\r\n' +
                '1 1 \r\n' +
                '1 2 1 \r\n' +
                '1 3 3 1 \r\n' +
                '1 4 6 4 1 \r\n'

        expect:
        capture.toString() == exp
    }
}
