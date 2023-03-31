package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e50;
import javax.annotation.concurrent.GuardedBy;

public final class eb1<RequestComponentT extends e50<AdT>, AdT> implements mb1<RequestComponentT, AdT> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private RequestComponentT f2392a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized RequestComponentT a() {
        return this.f2392a;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final synchronized lo1<AdT> a(nb1 nb1, ob1<RequestComponentT> ob1) {
        RequestComponentT f;
        f = ob1.a(nb1.f3824b).f();
        this.f2392a = f;
        return f.a().b();
    }
}
