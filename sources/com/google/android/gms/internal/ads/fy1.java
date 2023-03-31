package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class fy1 implements Comparator<dy1> {
    fy1() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(dy1 dy1, dy1 dy12) {
        dy1 dy13 = dy1;
        dy1 dy14 = dy12;
        my1 my1 = (my1) dy13.iterator();
        my1 my12 = (my1) dy14.iterator();
        while (my1.hasNext() && my12.hasNext()) {
            int compare = Integer.compare(dy1.a(my1.nextByte()), dy1.a(my12.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(dy13.size(), dy14.size());
    }
}
