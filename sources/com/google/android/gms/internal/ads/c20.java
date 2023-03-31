package com.google.android.gms.internal.ads;

import android.content.Context;

public final class c20 implements r42<d20> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2045a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ws> f2046b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<id1> f2047c;
    private final e52<fo> d;

    public c20(e52<Context> e52, e52<ws> e522, e52<id1> e523, e52<fo> e524) {
        this.f2045a = e52;
        this.f2046b = e522;
        this.f2047c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new d20(this.f2045a.get(), this.f2046b.get(), this.f2047c.get(), this.d.get());
    }
}
