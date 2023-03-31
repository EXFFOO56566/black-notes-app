package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zw0 implements r42<yw0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5817a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fk0> f5818b;

    public zw0(e52<Context> e52, e52<fk0> e522) {
        this.f5817a = e52;
        this.f5818b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new yw0(this.f5817a.get(), this.f5818b.get());
    }
}
