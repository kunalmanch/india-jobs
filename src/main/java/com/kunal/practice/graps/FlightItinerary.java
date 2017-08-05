package com.kunal.practice.graps;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string of "from","to" airport codes, arrange them in order of travel.
 */
public class FlightItinerary {

    public static void order(String trips, String src) {
        String[] airports = trips.split(",");
        Map<String, String> fromToMap = new HashMap<>();
        for (int i = 0; i < airports.length; i += 2) {
            fromToMap.put(airports[i], airports[i + 1]);
        }

        dfs(src, fromToMap);
    }

    private static void dfs(String src, Map<String, String> fromToMap) {
        String dest = fromToMap.get(src);
        if (dest == null) return;
        System.err.println(src + "->" + dest);
        dfs(dest, fromToMap);
    }
}
