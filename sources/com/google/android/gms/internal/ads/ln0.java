package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ln0 implements r42<ab0<m80>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<jn0> f3583a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3584b;

    private ln0(e52<jn0> e52, e52<Executor> e522) {
        this.f3583a = e52;
        this.f3584b = e522;
    }

    public static ln0 a(e52<jn0> e52, e52<Executor> e522) {
        return new ln0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3583a.get(), this.f3584b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
