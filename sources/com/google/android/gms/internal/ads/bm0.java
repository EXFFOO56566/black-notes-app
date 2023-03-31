package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class bm0 implements r42<ab0<a60>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<lm0> f1974a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f1975b;

    private bm0(e52<lm0> e52, e52<Executor> e522) {
        this.f1974a = e52;
        this.f1975b = e522;
    }

    public static bm0 a(e52<lm0> e52, e52<Executor> e522) {
        return new bm0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f1974a.get(), this.f1975b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
