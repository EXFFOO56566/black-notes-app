package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ks0 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ss0> f3445a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3446b;

    private ks0(e52<ss0> e52, e52<Executor> e522) {
        this.f3445a = e52;
        this.f3446b = e522;
    }

    public static ks0 a(e52<ss0> e52, e52<Executor> e522) {
        return new ks0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3445a.get(), this.f3446b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
