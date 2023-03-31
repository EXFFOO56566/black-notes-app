package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class qt implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final rt f4386b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f4387c;

    qt(rt rtVar, Map map) {
        this.f4386b = rtVar;
        this.f4387c = map;
    }

    public final void run() {
        this.f4386b.a(this.f4387c);
    }
}
