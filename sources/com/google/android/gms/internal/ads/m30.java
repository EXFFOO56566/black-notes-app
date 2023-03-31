package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class m30 implements r42<ab0<q70>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<a80> f3650a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f3651b;

    private m30(e52<a80> e52, e52<Executor> e522) {
        this.f3650a = e52;
        this.f3651b = e522;
    }

    public static m30 a(e52<a80> e52, e52<Executor> e522) {
        return new m30(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f3650a.get(), this.f3651b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
