package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class xf0 implements r42<ab0<b80>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<qz0> f5420a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5421b;

    private xf0(e52<qz0> e52, e52<Executor> e522) {
        this.f5420a = e52;
        this.f5421b = e522;
    }

    public static xf0 a(e52<qz0> e52, e52<Executor> e522) {
        return new xf0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f5420a.get(), this.f5421b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
