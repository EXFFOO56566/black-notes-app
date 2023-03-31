package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ix0 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    private final ws f3145a;

    /* renamed from: b  reason: collision with root package name */
    private final id1 f3146b;

    /* renamed from: c  reason: collision with root package name */
    private final ek0 f3147c;

    ix0(ex0 ex0, ws wsVar, id1 id1, ek0 ek0) {
        this.f3145a = wsVar;
        this.f3146b = id1;
        this.f3147c = ek0;
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        ws wsVar = this.f3145a;
        id1 id1 = this.f3146b;
        ek0 ek0 = this.f3147c;
        if (id1.E) {
            wsVar.Q();
        }
        wsVar.x();
        if (((Boolean) on2.e().a(zr2.h0)).booleanValue()) {
            q.e();
            ll.a(wsVar);
        }
        return ek0.k();
    }
}
