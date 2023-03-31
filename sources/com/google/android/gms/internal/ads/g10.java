package com.google.android.gms.internal.ads;

import android.content.Context;

public final class g10 implements r42<zi> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2687a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f2688b;

    public g10(r00 r00, e52<Context> e52, e52<zd1> e522) {
        this.f2687a = e52;
        this.f2688b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        zi ziVar = new zi(this.f2687a.get(), this.f2688b.get().f);
        y42.a(ziVar, "Cannot return null from a non-@Nullable @Provides method");
        return ziVar;
    }
}
