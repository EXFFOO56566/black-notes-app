package com.google.android.gms.common.util;

import android.os.SystemClock;

public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private static final g f1656a = new g();

    private g() {
    }

    public static d d() {
        return f1656a;
    }

    @Override // com.google.android.gms.common.util.d
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.d
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.d
    public long c() {
        return System.nanoTime();
    }
}
