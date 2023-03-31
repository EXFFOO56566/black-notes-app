package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class ai0 implements r42<ph0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f1761a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<jh0> f1762b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<eq1> f1763c;
    private final e52<fo> d;
    private final e52<a> e;
    private final e52<wj2> f;
    private final e52<Executor> g;
    private final e52<zd1> h;
    private final e52<gi0> i;
    private final e52<ScheduledExecutorService> j;

    public ai0(e52<Context> e52, e52<jh0> e522, e52<eq1> e523, e52<fo> e524, e52<a> e525, e52<wj2> e526, e52<Executor> e527, e52<zd1> e528, e52<gi0> e529, e52<ScheduledExecutorService> e5210) {
        this.f1761a = e52;
        this.f1762b = e522;
        this.f1763c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
        this.i = e529;
        this.j = e5210;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ph0(this.f1761a.get(), this.f1762b.get(), this.f1763c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
