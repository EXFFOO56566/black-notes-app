package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

public final class tm1 {
    public static int a(int i, int i2) {
        long j = ((long) i) << 1;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }
}
