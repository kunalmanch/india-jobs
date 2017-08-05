package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/8/2017.
 */
class GenerateParenthesisTest extends BaseSpec {

    def "generate parenthesis"() {
        given:
        def expected = ''
        GenerateParenthesis.generate(new char[6], 0, 0, 0)

        expect:
        capture.toString() == expected
    }
}
