package com.google.android.gms.internal.ads;

import android.content.Context;

public final class m31 implements r42<k31> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f3652a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f3653b;

    public m31(e52<ko1> e52, e52<Context> e522) {
        this.f3652a = e52;
        this.f3653b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new k31(this.f3652a.get(), this.f3653b.get());
    }
}
