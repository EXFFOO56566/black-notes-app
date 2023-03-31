package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.ads.v61;

/* access modifiers changed from: package-private */
public final class p31<S extends v61<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final lo1<S> f4095a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4096b;

    /* renamed from: c  reason: collision with root package name */
    private final d f4097c;

    public p31(lo1<S> lo1, long j, d dVar) {
        this.f4095a = lo1;
        this.f4097c = dVar;
        this.f4096b = dVar.b() + j;
    }

    public final boolean a() {
        return this.f4096b < this.f4097c.b();
    }
}
