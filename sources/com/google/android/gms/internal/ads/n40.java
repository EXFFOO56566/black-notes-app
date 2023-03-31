package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class n40 implements r42<ab0<t80>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<hn0> f3794a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3795b;

    private n40(e52<hn0> e52, e52<Executor> e522) {
        this.f3794a = e52;
        this.f3795b = e522;
    }

    public static n40 a(e52<hn0> e52, e52<Executor> e522) {
        return new n40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3794a.get(), this.f3795b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
