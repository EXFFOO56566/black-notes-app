package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class mn0 implements r42<ab0<zh1>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<yn0> f3731a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3732b;

    private mn0(e52<yn0> e52, e52<Executor> e522) {
        this.f3731a = e52;
        this.f3732b = e522;
    }

    public static mn0 a(e52<yn0> e52, e52<Executor> e522) {
        return new mn0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3731a.get(), this.f3732b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
