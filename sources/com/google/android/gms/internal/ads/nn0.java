package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class nn0 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<jn0> f3870a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3871b;

    private nn0(e52<jn0> e52, e52<Executor> e522) {
        this.f3870a = e52;
        this.f3871b = e522;
    }

    public static nn0 a(e52<jn0> e52, e52<Executor> e522) {
        return new nn0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3870a.get(), this.f3871b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
