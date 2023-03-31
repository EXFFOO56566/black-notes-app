package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g50;

public final class ee0 implements r42<p20<n00>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<kv> f2407a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<g50.a> f2408b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<k90> f2409c;
    private final e52<vd0> d;
    private final e52<e80> e;

    public ee0(e52<kv> e52, e52<g50.a> e522, e52<k90> e523, e52<vd0> e524, e52<e80> e525) {
        this.f2407a = e52;
        this.f2408b = e522;
        this.f2409c = e523;
        this.d = e524;
        this.e = e525;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        j10 h = this.f2407a.get().h();
        h.d(this.f2408b.get().a());
        h.b(this.f2409c.get());
        h.a(this.d.get());
        h.b(new ry0(null));
        h.a(new h20(this.e.get()));
        h.a(new i00(null));
        p20<n00> c2 = h.a().c();
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
