package com.kunal.practice.binarysearch

import spock.lang.Specification

/**
 * Created by kunal on 7/16/2017.
 */
class TwoDMatrixTest extends Specification {

    def "search in row and column sorted 2d matrix"() {
        given:
        def matrix = [
                [1,   4,  7, 11, 15],
                [2,   5,  8, 12, 19],
                [3,   6,  9, 16, 22],
                [10, 13, 14, 17, 24],
                [18, 21, 23, 26, 30]
        ] as int[][]

        expect:
        TwoDMatrix.rowColumnSortedFind(matrix, 5) == true
    }

    def "search in strictly sorted 2D matrix"() {
        given:
        def matrix = [
                [1,   3,  5,  7],
                [10, 11, 16, 20],
                [23, 30, 34, 50]
        ] as int[][]

        expect:
        TwoDMatrix.strictSortFind(matrix, 3) == true
        TwoDMatrix.strictSortFind(matrix, 34) == true
        TwoDMatrix.strictSortFind(matrix, 23) == true
        TwoDMatrix.strictSortFind(matrix, 1) == true
        TwoDMatrix.strictSortFind(matrix, 33) == false
    }
}
