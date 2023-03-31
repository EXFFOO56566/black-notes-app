package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class tp0 implements r42<ab0<m80>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<yq0> f4841a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4842b;

    private tp0(e52<yq0> e52, e52<Executor> e522) {
        this.f4841a = e52;
        this.f4842b = e522;
    }

    public static tp0 a(e52<yq0> e52, e52<Executor> e522) {
        return new tp0(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f4841a.get(), this.f4842b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
