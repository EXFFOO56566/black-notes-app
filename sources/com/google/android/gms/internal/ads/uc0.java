package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class uc0 implements r42<ab0<q80>> {

    /* renamed from: a  reason: collision with root package name */
    private final fc0 f4926a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4927b;

    private uc0(fc0 fc0, e52<Executor> e52) {
        this.f4926a = fc0;
        this.f4927b = e52;
    }

    public static uc0 a(fc0 fc0, e52<Executor> e52) {
        return new uc0(fc0, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0<q80> a2 = this.f4926a.a(this.f4927b.get());
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
