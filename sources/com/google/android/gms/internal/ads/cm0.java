package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class cm0 implements r42<ab0<jm2>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<lm0> f2139a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2140b;

    private cm0(e52<lm0> e52, e52<Executor> e522) {
        this.f2139a = e52;
        this.f2140b = e522;
    }

    public static cm0 a(e52<lm0> e52, e52<Executor> e522) {
        return new cm0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2139a.get(), this.f2140b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
