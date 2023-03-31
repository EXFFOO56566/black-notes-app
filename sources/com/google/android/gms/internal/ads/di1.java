package com.google.android.gms.internal.ads;

import android.content.Context;

public final class di1 implements r42<q9> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2258a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f2259b;

    public di1(ai1 ai1, e52<Context> e52, e52<fo> e522) {
        this.f2258a = e52;
        this.f2259b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        q9 b2 = new h9().b(this.f2258a.get(), this.f2259b.get());
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
