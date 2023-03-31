package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.ScheduledExecutorService;

public final class k00 implements r42<e80> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f3303a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<d> f3304b;

    public k00(e52<ScheduledExecutorService> e52, e52<d> e522) {
        this.f3303a = e52;
        this.f3304b = e522;
    }

    public static e80 a(ScheduledExecutorService scheduledExecutorService, d dVar) {
        e80 e80 = new e80(scheduledExecutorService, dVar);
        y42.a(e80, "Cannot return null from a non-@Nullable @Provides method");
        return e80;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f3303a.get(), this.f3304b.get());
    }
}
