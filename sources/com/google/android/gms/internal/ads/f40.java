package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class f40 implements r42<ab0<n60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ty> f2530a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2531b;

    private f40(e52<ty> e52, e52<Executor> e522) {
        this.f2530a = e52;
        this.f2531b = e522;
    }

    public static f40 a(e52<ty> e52, e52<Executor> e522) {
        return new f40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2530a.get(), this.f2531b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
