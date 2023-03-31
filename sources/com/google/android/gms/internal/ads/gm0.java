package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class gm0 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<lm0> f2782a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2783b;

    private gm0(e52<lm0> e52, e52<Executor> e522) {
        this.f2782a = e52;
        this.f2783b = e522;
    }

    public static gm0 a(e52<lm0> e52, e52<Executor> e522) {
        return new gm0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2782a.get(), this.f2783b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
