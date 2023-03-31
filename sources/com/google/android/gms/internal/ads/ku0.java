package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ku0 implements r42<gu0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3449a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<k10> f3450b;

    public ku0(e52<Context> e52, e52<k10> e522) {
        this.f3449a = e52;
        this.f3450b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new gu0(this.f3449a.get(), this.f3450b.get());
    }
}
