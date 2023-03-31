package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class j30 implements r42<ab0<n60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<a80> f3168a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3169b;

    private j30(e52<a80> e52, e52<Executor> e522) {
        this.f3168a = e52;
        this.f3169b = e522;
    }

    public static j30 a(e52<a80> e52, e52<Executor> e522) {
        return new j30(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3168a.get(), this.f3169b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
