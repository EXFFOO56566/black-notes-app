package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class hs0 implements r42<ab0<a60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ss0> f2970a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2971b;

    private hs0(e52<ss0> e52, e52<Executor> e522) {
        this.f2970a = e52;
        this.f2971b = e522;
    }

    public static hs0 a(e52<ss0> e52, e52<Executor> e522) {
        return new hs0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2970a.get(), this.f2971b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
