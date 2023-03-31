package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class ti0 implements r42<li0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f4817a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<nz> f4818b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<za0> f4819c;

    public ti0(e52<Executor> e52, e52<nz> e522, e52<za0> e523) {
        this.f4817a = e52;
        this.f4818b = e522;
        this.f4819c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new li0(this.f4817a.get(), this.f4818b.get(), this.f4819c.get());
    }
}
