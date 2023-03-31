package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p;
import java.util.concurrent.Executor;

public final class gh0 implements r42<ab0<p.a>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<yj0> f2758a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2759b;

    public gh0(ah0 ah0, e52<yj0> e52, e52<Executor> e522) {
        this.f2758a = e52;
        this.f2759b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f2758a.get(), this.f2759b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
