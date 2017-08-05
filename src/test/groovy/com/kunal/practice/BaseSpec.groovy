package com.kunal.practice

import org.springframework.boot.test.OutputCapture
import spock.lang.Specification

/**
 * Created by kunal on 7/8/2017.
 */
class BaseSpec extends Specification {
    @org.junit.Rule
    OutputCapture capture = new OutputCapture()
}
