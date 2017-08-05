package com.kunal.practice.graps

import com.kunal.practice.BaseSpec

/**
 * Created by kunal on 7/15/2017.
 */
class FlightItineraryTest extends BaseSpec {
    void testOrder() {
        given:
        def trips = 'JFK,LXA,SNA,RKJ,LXA,SNA'
        FlightItinerary.order(trips, 'JFK')
        def exp = 'JFK->LXA\r\n' +
                'LXA->SNA\r\n' +
                'SNA->RKJ\r\n'

        expect:
        capture.toString() == exp
    }
}
