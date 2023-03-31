package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g50;

public final class dw0 implements r42<ew0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<kv> f2325a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<vd0> f2326b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<g50.a> f2327c;
    private final e52<k90> d;

    public dw0(e52<kv> e52, e52<vd0> e522, e52<g50.a> e523, e52<k90> e524) {
        this.f2325a = e52;
        this.f2326b = e522;
        this.f2327c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ew0(this.f2325a.get(), this.f2326b.get(), this.f2327c.get(), this.d.get());
    }
}
