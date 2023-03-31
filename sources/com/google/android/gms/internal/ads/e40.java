package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class e40 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ty> f2365a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2366b;

    private e40(e52<ty> e52, e52<Executor> e522) {
        this.f2365a = e52;
        this.f2366b = e522;
    }

    public static ab0<l70> a(ty tyVar, Executor executor) {
        ab0<l70> ab0 = new ab0<>(tyVar, executor);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }

    public static e40 a(e52<ty> e52, e52<Executor> e522) {
        return new e40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2365a.get(), this.f2366b.get());
    }
}
