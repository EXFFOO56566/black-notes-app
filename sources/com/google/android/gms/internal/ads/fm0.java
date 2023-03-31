package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class fm0 implements r42<ab0<m80>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<lm0> f2621a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2622b;

    private fm0(e52<lm0> e52, e52<Executor> e522) {
        this.f2621a = e52;
        this.f2622b = e522;
    }

    public static fm0 a(e52<lm0> e52, e52<Executor> e522) {
        return new fm0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2621a.get(), this.f2622b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
