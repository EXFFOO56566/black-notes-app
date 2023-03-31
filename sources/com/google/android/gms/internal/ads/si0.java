package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class si0 implements r42<gi0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<zd1> f4660a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4661b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<pk0> f4662c;

    public si0(e52<zd1> e52, e52<Executor> e522, e52<pk0> e523) {
        this.f4660a = e52;
        this.f4661b = e522;
        this.f4662c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new gi0(this.f4660a.get(), this.f4661b.get(), this.f4662c.get());
    }
}
