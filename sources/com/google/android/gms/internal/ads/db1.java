package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e50;
import javax.annotation.concurrent.GuardedBy;

public final class db1<RequestComponentT extends e50<AdT>, AdT> implements mb1<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final mb1<RequestComponentT, AdT> f2237a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private RequestComponentT f2238b;

    public db1(mb1<RequestComponentT, AdT> mb1) {
        this.f2237a = mb1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized RequestComponentT a() {
        return this.f2238b;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final synchronized lo1<AdT> a(nb1 nb1, ob1<RequestComponentT> ob1) {
        if (nb1.f3823a != null) {
            RequestComponentT f = ob1.a(nb1.f3824b).f();
            this.f2238b = f;
            return f.a().b(nb1.f3823a);
        }
        lo1<AdT> a2 = this.f2237a.a(nb1, ob1);
        this.f2238b = this.f2237a.a();
        return a2;
    }
}
