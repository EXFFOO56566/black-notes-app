package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ns0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final ms0 f3882a;

    private ns0(ms0 ms0) {
        this.f3882a = ms0;
    }

    static Callable a(ms0 ms0) {
        return new ns0(ms0);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3882a.getWritableDatabase();
    }
}
