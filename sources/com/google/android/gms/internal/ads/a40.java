package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class a40 implements r42<ab0<fb0>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<jb0> f1690a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f1691b;

    private a40(e52<jb0> e52, e52<Executor> e522) {
        this.f1690a = e52;
        this.f1691b = e522;
    }

    public static a40 a(e52<jb0> e52, e52<Executor> e522) {
        return new a40(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ab0 ab0 = new ab0(this.f1690a.get(), this.f1691b.get());
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }
}
