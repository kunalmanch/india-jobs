package com.kunal.practice

/**
 * Created by kunal on 7/8/2017.
 */
class Helpers {

    static def toIntArray(list) {
        def arr = new int[list.size()]
        def j = 0
        for (int i : list) {
            arr.putAt(j++, i)
        }
        return arr;
    }
}
