package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class vn0 implements r42<tn0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<zn0> f5138a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5139b;

    public vn0(e52<zn0> e52, e52<Executor> e522) {
        this.f5138a = e52;
        this.f5139b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new tn0(this.f5138a.get(), this.f5139b.get());
    }
}
