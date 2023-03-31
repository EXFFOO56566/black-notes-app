package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class cu0 implements r42<st0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<k10> f2168a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2169b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f2170c;
    private final e52<pk0> d;
    private final e52<zd1> e;
    private final e52<xk1<id1, xl>> f;

    public cu0(e52<k10> e52, e52<Context> e522, e52<Executor> e523, e52<pk0> e524, e52<zd1> e525, e52<xk1<id1, xl>> e526) {
        this.f2168a = e52;
        this.f2169b = e522;
        this.f2170c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new st0(this.f2168a.get(), this.f2169b.get(), this.f2170c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
