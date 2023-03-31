package com.google.android.gms.internal.ads;

public final class it0<DelegateT, AdapterT> implements jt0<AdapterT> {

    /* renamed from: a  reason: collision with root package name */
    private final jt0<DelegateT> f3134a;

    /* renamed from: b  reason: collision with root package name */
    private final xk1<DelegateT, AdapterT> f3135b;

    public it0(jt0<DelegateT> jt0, xk1<DelegateT, AdapterT> xk1) {
        this.f3134a = jt0;
        this.f3135b = xk1;
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final lo1<AdapterT> a(vd1 vd1, id1 id1) {
        return yn1.a(this.f3134a.a(vd1, id1), this.f3135b, jo.f3256a);
    }

    @Override // com.google.android.gms.internal.ads.jt0
    public final boolean b(vd1 vd1, id1 id1) {
        return this.f3134a.b(vd1, id1);
    }
}
