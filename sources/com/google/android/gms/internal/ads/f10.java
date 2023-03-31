package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class f10 implements r42<ab0<fh2>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<j20> f2516a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2517b;

    public f10(r00 r00, e52<j20> e52, e52<Executor> e522) {
        this.f2516a = e52;
        this.f2517b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2516a.get(), this.f2517b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
