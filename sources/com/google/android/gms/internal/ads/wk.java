package com.google.android.gms.internal.ads;

import android.util.Log;

public final class wk extends co {
    public static boolean a() {
        return co.a(2) && q0.f4253a.a().booleanValue();
    }

    public static void e(String str) {
        if (a()) {
            Log.v("Ads", str);
        }
    }

    public static void e(String str, Throwable th) {
        if (a()) {
            Log.v("Ads", str, th);
        }
    }
}
