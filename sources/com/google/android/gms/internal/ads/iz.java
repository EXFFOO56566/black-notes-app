package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class iz implements r42<vy> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ah2> f3150a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<v9> f3151b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f3152c;

    private iz(e52<ah2> e52, e52<v9> e522, e52<Executor> e523) {
        this.f3150a = e52;
        this.f3151b = e522;
        this.f3152c = e523;
    }

    public static iz a(e52<ah2> e52, e52<v9> e522, e52<Executor> e523) {
        return new iz(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        vy vyVar = new vy(this.f3150a.get().e(), this.f3151b.get(), this.f3152c.get());
        y42.a(vyVar, "Cannot return null from a non-@Nullable @Provides method");
        return vyVar;
    }
}
