package com.kunal.practice.backtracking;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kunal on 7/12/2017.
 */
public class PhoneNumWord {
    static Map<Integer, char[]> map = new HashMap<>();

    static {
        map.put(1, new char[]{'\0'});
        map.put(2, new char[]{'a', 'b', 'c'});
        map.put(3, new char[]{'d', 'e', 'f'});
        map.put(4, new char[]{'g', 'h', 'i'});
        map.put(5, new char[]{'j', 'k', 'l'});
        map.put(6, new char[]{'m', 'n', 'o'});
        map.put(7, new char[]{'p', 'q', 'r', 's'});
        map.put(8, new char[]{'t', 'u', 'v'});
        map.put(9, new char[]{'w', 'x', 'y', 'z'});
        map.put(0, new char[]{'+'});
    }

    public static void words(int[] nums, char[] ch, int idx) {
        if (idx == ch.length) {
            System.err.print(new String(ch) + " ");
        } else if (idx < ch.length) {
            char[] chars = map.get(nums[idx]);
            try {
                for (char c : chars) {
                    ch[idx] = c;
                    words(nums, ch, idx + 1);
                }
            } catch (NullPointerException e) {
                System.err.println("");
            }
        }
    }
}
