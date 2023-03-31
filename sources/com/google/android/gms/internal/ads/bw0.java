package com.google.android.gms.internal.ads;

import android.content.Context;

public final class bw0 implements r42<wv0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2020a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd0> f2021b;

    public bw0(e52<Context> e52, e52<zd0> e522) {
        this.f2020a = e52;
        this.f2021b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new wv0(this.f2020a.get(), this.f2021b.get());
    }
}
