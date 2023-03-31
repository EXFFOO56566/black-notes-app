package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zy0 implements r42<vy0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5821a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ad0> f5822b;

    public zy0(e52<Context> e52, e52<ad0> e522) {
        this.f5821a = e52;
        this.f5822b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new vy0(this.f5821a.get(), this.f5822b.get());
    }
}
