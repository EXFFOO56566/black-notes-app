package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class sc0 implements r42<ab0<u50>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<rd0> f4631a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4632b;

    private sc0(fc0 fc0, e52<rd0> e52, e52<Executor> e522) {
        this.f4631a = e52;
        this.f4632b = e522;
    }

    public static sc0 a(fc0 fc0, e52<rd0> e52, e52<Executor> e522) {
        return new sc0(fc0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4631a.get(), this.f4632b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
