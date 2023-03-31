package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.atomic.AtomicReference;

public final class q31<S extends v61<?>> implements y61<S> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<p31<S>> f4265a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final d f4266b;

    /* renamed from: c  reason: collision with root package name */
    private final y61<S> f4267c;
    private final long d;

    public q31(y61<S> y61, long j, d dVar) {
        this.f4266b = dVar;
        this.f4267c = y61;
        this.d = j;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<S> a() {
        p31<S> p31 = this.f4265a.get();
        if (p31 == null || p31.a()) {
            p31 = new p31<>(this.f4267c.a(), this.d, this.f4266b);
            this.f4265a.set(p31);
        }
        return p31.f4095a;
    }
}
