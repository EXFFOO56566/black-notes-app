package com.google.android.gms.internal.ads;

import android.content.Context;

public final class g71 implements r42<e71> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f2719a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2720b;

    public g71(e52<ko1> e52, e52<Context> e522) {
        this.f2719a = e52;
        this.f2720b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new e71(this.f2719a.get(), this.f2720b.get());
    }
}
