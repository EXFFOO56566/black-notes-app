package com.google.android.gms.internal.ads;

import android.content.Context;

public final class nz0 implements r42<kz0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3915a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<rn2> f3916b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f3917c;
    private final e52<n00> d;

    public nz0(e52<Context> e52, e52<rn2> e522, e52<zd1> e523, e52<n00> e524) {
        this.f3915a = e52;
        this.f3916b = e522;
        this.f3917c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new kz0(this.f3915a.get(), this.f3916b.get(), this.f3917c.get(), this.d.get());
    }
}
