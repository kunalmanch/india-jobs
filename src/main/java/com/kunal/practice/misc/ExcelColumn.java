package com.kunal.practice.misc;

/**
 * Created by kunal on 7/17/2017.
 */
public class ExcelColumn {

    public static String seqToColumnName(int seq) {
        StringBuilder sb = new StringBuilder();
        while (seq > 0) {
            seq--;
            int c = (seq % 26) + 'A';
            sb.append((char)c);
            seq /= 26;
        }
        sb.reverse();
        return sb.toString();
    }

    public static int nameToSeq(String col) {
        int seq = 0;
        for (int i = 0; i < col.length(); i++) {
            seq += Math.pow(26, i) * (col.charAt(col.length() - i - 1) - 'A' + 1);
        }
        return seq;
    }
}
