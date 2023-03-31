package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class l40 implements r42<ab0<z50>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<hn0> f3492a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3493b;

    private l40(e52<hn0> e52, e52<Executor> e522) {
        this.f3492a = e52;
        this.f3493b = e522;
    }

    public static l40 a(e52<hn0> e52, e52<Executor> e522) {
        return new l40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3492a.get(), this.f3493b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
