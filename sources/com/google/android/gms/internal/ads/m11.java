package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class m11 implements r42<k11> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f3643a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<sq0> f3644b;

    public m11(e52<Executor> e52, e52<sq0> e522) {
        this.f3643a = e52;
        this.f3644b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new k11(this.f3643a.get(), this.f3644b.get());
    }
}
