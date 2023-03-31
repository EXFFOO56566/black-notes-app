package com.google.android.gms.internal.ads;

import android.os.Trace;

public final class bg2 {
    public static void a() {
        if (ag2.f1751a >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (ag2.f1751a >= 18) {
            Trace.beginSection(str);
        }
    }
}
