package com.google.android.gms.internal.ads;

import android.content.Context;

public final class rp0 implements r42<lo1<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<eq1> f4531a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f4532b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<ko1> f4533c;

    private rp0(e52<eq1> e52, e52<Context> e522, e52<ko1> e523) {
        this.f4531a = e52;
        this.f4532b = e522;
        this.f4533c = e523;
    }

    public static rp0 a(e52<eq1> e52, e52<Context> e522, e52<ko1> e523) {
        return new rp0(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        lo1 a2 = this.f4533c.get().a(new op0(this.f4531a.get(), this.f4532b.get()));
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
