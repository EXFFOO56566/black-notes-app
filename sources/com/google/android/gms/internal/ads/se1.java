package com.google.android.gms.internal.ads;

import android.content.Context;

public final class se1 implements r42<te1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4648a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<tk> f4649b;

    private se1(e52<Context> e52, e52<tk> e522) {
        this.f4648a = e52;
        this.f4649b = e522;
    }

    public static se1 a(e52<Context> e52, e52<tk> e522) {
        return new se1(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new te1(this.f4648a.get(), this.f4649b.get());
    }
}
