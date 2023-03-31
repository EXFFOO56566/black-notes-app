package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class nu0 implements jt0<n00> {

    /* renamed from: a  reason: collision with root package name */
    private final k10 f3889a;

    /* renamed from: b  reason: collision with root package name */
    private final st0 f3890b;

    /* renamed from: c  reason: collision with root package name */
    private final ko1 f3891c;
    private final y50 d;
    private final ScheduledExecutorService e;

    public nu0(k10 k10, st0 st0, y50 y50, ScheduledExecutorService scheduledExecutorService, ko1 ko1) {
        this.f3889a = k10;
        this.f3890b = st0;
        this.d = y50;
        this.e = scheduledExecutorService;
        this.f3891c = ko1;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<n00> a(vd1 vd1, id1 id1) {
        return this.f3891c.a(new qu0(this, vd1, id1));
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        return vd1.f5092a.f4150a.a() != null && this.f3890b.b(vd1, id1);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ n00 c(vd1 vd1, id1 id1) {
        return this.f3889a.a(new d30(vd1, id1, null), new z10(vd1.f5092a.f4150a.a(), new pu0(this, vd1, id1))).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(vd1 vd1, id1 id1) {
        yn1.a(yn1.a(this.f3890b.a(vd1, id1), (long) id1.I, TimeUnit.SECONDS, this.e), new su0(this), this.f3891c);
    }
}
