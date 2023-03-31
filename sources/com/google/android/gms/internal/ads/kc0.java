package com.google.android.gms.internal.ads;

import android.content.Context;

public final class kc0 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3367a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f3368b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<id1> f3369c;
    private final e52<zd1> d;

    private kc0(fc0 fc0, e52<Context> e52, e52<fo> e522, e52<id1> e523, e52<zd1> e524) {
        this.f3367a = e52;
        this.f3368b = e522;
        this.f3369c = e523;
        this.d = e524;
    }

    public static kc0 a(fc0 fc0, e52<Context> e52, e52<fo> e522, e52<id1> e523, e52<zd1> e524) {
        return new kc0(fc0, e52, e522, e523, e524);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(new ec0(this.f3367a.get(), this.f3368b.get(), this.f3369c.get(), this.d.get()), jo.f);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
