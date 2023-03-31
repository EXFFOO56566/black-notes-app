package com.google.android.gms.internal.ads;

import android.content.Context;

public final class br0 implements r42<yq0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f1999a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<cj> f2000b;

    private br0(e52<Context> e52, e52<cj> e522) {
        this.f1999a = e52;
        this.f2000b = e522;
    }

    public static br0 a(e52<Context> e52, e52<cj> e522) {
        return new br0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new yq0(this.f1999a.get(), this.f2000b.get());
    }
}
