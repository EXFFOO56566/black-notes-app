package com.google.android.gms.internal.ads;

import android.content.Context;

public final class u40 implements r42<xk1<id1, xl>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4896a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f4897b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f4898c;

    public u40(e52<Context> e52, e52<fo> e522, e52<zd1> e523) {
        this.f4896a = e52;
        this.f4897b = e522;
        this.f4898c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        v40 v40 = new v40(this.f4896a.get(), this.f4897b.get(), this.f4898c.get());
        y42.a(v40, "Cannot return null from a non-@Nullable @Provides method");
        return v40;
    }
}
