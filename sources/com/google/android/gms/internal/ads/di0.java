package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class di0 implements r42<zh0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f2256a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ph0> f2257b;

    public di0(e52<Executor> e52, e52<ph0> e522) {
        this.f2256a = e52;
        this.f2257b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new zh0(this.f2256a.get(), this.f2257b.get());
    }
}
