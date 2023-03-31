package com.google.android.gms.internal.ads;

import android.content.Context;

public final class qc0 implements r42<zi> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4309a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f4310b;

    private qc0(fc0 fc0, e52<Context> e52, e52<zd1> e522) {
        this.f4309a = e52;
        this.f4310b = e522;
    }

    public static qc0 a(fc0 fc0, e52<Context> e52, e52<zd1> e522) {
        return new qc0(fc0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        zi ziVar = new zi(this.f4309a.get(), this.f4310b.get().f);
        y42.a(ziVar, "Cannot return null from a non-@Nullable @Provides method");
        return ziVar;
    }
}
