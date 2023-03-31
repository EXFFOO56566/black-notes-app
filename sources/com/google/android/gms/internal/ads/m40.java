package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class m40 implements r42<ab0<n60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<hn0> f3656a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3657b;

    private m40(e52<hn0> e52, e52<Executor> e522) {
        this.f3656a = e52;
        this.f3657b = e522;
    }

    public static m40 a(e52<hn0> e52, e52<Executor> e522) {
        return new m40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3656a.get(), this.f3657b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
