package com.google.android.gms.internal.ads;

import android.content.Context;

public final class kv0 implements r42<jv0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3452a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ad0> f3453b;

    public kv0(e52<Context> e52, e52<ad0> e522) {
        this.f3452a = e52;
        this.f3453b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new jv0(this.f3452a.get(), this.f3453b.get());
    }
}
