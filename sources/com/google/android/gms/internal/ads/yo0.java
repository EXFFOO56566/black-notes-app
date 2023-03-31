package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class yo0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final uo0 f5622b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5623c;
    private final ro d;
    private final String e;
    private final long f;

    yo0(uo0 uo0, Object obj, ro roVar, String str, long j) {
        this.f5622b = uo0;
        this.f5623c = obj;
        this.d = roVar;
        this.e = str;
        this.f = j;
    }

    public final void run() {
        this.f5622b.a(this.f5623c, this.d, this.e, this.f);
    }
}
