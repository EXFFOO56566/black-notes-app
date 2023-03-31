package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class c40 implements r42<ab0<u50>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ty> f2056a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2057b;

    private c40(e52<ty> e52, e52<Executor> e522) {
        this.f2056a = e52;
        this.f2057b = e522;
    }

    public static c40 a(e52<ty> e52, e52<Executor> e522) {
        return new c40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2056a.get(), this.f2057b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
