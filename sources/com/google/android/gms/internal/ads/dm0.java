package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class dm0 implements r42<ab0<g90>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<lm0> f2278a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2279b;

    private dm0(e52<lm0> e52, e52<Executor> e522) {
        this.f2278a = e52;
        this.f2279b = e522;
    }

    public static dm0 a(e52<lm0> e52, e52<Executor> e522) {
        return new dm0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2278a.get(), this.f2279b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
