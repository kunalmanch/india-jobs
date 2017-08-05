package com.kunal.practice.misc

import spock.lang.Specification

/**
 * Created by kunal on 7/17/2017.
 */
class ExcelColumnTest extends Specification {
    void testSeqToColumnName() {
        expect:
        ExcelColumn.seqToColumnName(seq) == exp

        where:
        seq << [55, 54, 705, 702]
        exp << ['BC', 'BB', 'AAC', 'ZZ']
    }

    void testNameToSeq() {
        expect:
        ExcelColumn.nameToSeq(colname) == exp

        where:
        exp << [55, 54, 705, 702]
        colname << ['BC', 'BB', 'AAC', 'ZZ']
    }
}
