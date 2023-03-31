package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class kn0 implements r42<ab0<a60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<jn0> f3420a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3421b;

    private kn0(e52<jn0> e52, e52<Executor> e522) {
        this.f3420a = e52;
        this.f3421b = e522;
    }

    public static kn0 a(e52<jn0> e52, e52<Executor> e522) {
        return new kn0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3420a.get(), this.f3421b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
