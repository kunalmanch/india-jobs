package com.kunal.practice.trees;

/**
 * Created by kunal on 7/19/2017.
 */
public class SegmentTree {

    private int[] st;
    private int[] a;

    public SegmentTree(int[] a) {
        int height = (int)Math.ceil(Math.log(a.length) / Math.log(2));
        int maxSize = 2 * (int)(Math.pow(2, height)) - 1;
        st = new int[maxSize];
        create(a, st, 0, a.length - 1, 0);
        this.a = a;
    }

    private int create(int[] a, int[] st, int al, int ah, int si) {
        if (al == ah) {
            st[si] = a[al];
            return st[si];
        }

        int amid = al + ((ah - al) >> 1);
        st[si] = create(a, st, al, amid, 2 * si + 1) +
                create(a, st, amid + 1, ah, 2 * si + 2);
        return st[si];
    }

    public int sum(int ql, int qh) {
        return sum(ql, qh, 0, a.length - 1, 0);
    }

    private int sum(int ql, int qh, int al, int ah, int si) {
        if (ql <= al && qh >= ah) return st[si];

        if (qh < al || ql > ah) return 0;

        int mid = al + ((ah - al) >> 1);
        return sum(ql, qh, al, mid, 2 * si + 1) +
                sum(ql, qh, mid + 1, ah, 2 * si + 2);
    }

    public void update(int idx, int val) {
        int diff = val - a[idx];
        a[idx] = val;
        update(diff, idx, 0, a.length - 1, 0);
    }

    private void update(int diff, int idx, int al, int ah, int si) {
        if (idx < al || idx > ah) return;

        st[si] += diff;
        if (al != ah) {
            int mid = al + ((ah - al) >> 1);
            update(diff, idx, al, mid, 2 * si + 1);
            update(diff, idx, mid + 1, ah, 2 * si + 2);
        }
    }
}
