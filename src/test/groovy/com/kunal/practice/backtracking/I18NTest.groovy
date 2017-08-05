package com.kunal.practice.backtracking

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/13/2017.
 */
class I18NTest extends BaseSpec {

    void testI18n() {
        given:
        def s = "kunal"
        I18N.i18n(s, 1, s.length() - 1, new boolean[s.length()][s.length()])
        def exp = 'k3l|ku2l|kun1l|ku1al|k2al|k1nal|'

        expect:
        capture.toString() == exp
    }
}
