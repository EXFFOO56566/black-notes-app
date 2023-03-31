package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class js0 implements r42<ab0<zh1>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<vs0> f3272a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3273b;

    private js0(e52<vs0> e52, e52<Executor> e522) {
        this.f3272a = e52;
        this.f3273b = e522;
    }

    public static js0 a(e52<vs0> e52, e52<Executor> e522) {
        return new js0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3272a.get(), this.f3273b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
