package com.google.android.gms.internal.ads;

import android.content.Context;

public final class z00 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f5675a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f5676b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<fo> f5677c;
    private final e52<id1> d;
    private final e52<zd1> e;

    public z00(r00 r00, e52<Context> e52, e52<fo> e522, e52<id1> e523, e52<zd1> e524) {
        this.f5675a = r00;
        this.f5676b = e52;
        this.f5677c = e522;
        this.d = e523;
        this.e = e524;
    }

    public static ab0<l70> a(r00 r00, Context context, fo foVar, id1 id1, zd1 zd1) {
        ab0<l70> ab0 = new ab0<>(new u00(context, foVar, id1, zd1), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5675a, this.f5676b.get(), this.f5677c.get(), this.d.get(), this.e.get());
    }
}
