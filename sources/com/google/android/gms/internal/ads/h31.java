package com.google.android.gms.internal.ads;

import android.content.Context;

public final class h31 implements r42<f31> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f2850a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2851b;

    private h31(e52<ko1> e52, e52<Context> e522) {
        this.f2850a = e52;
        this.f2851b = e522;
    }

    public static h31 a(e52<ko1> e52, e52<Context> e522) {
        return new h31(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new f31(this.f2850a.get(), this.f2851b.get());
    }
}
