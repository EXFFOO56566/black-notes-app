package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class hp0 implements r42<uo0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f2957a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2958b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<WeakReference<Context>> f2959c;
    private final e52<Executor> d;
    private final e52<rl0> e;
    private final e52<ScheduledExecutorService> f;
    private final e52<eo0> g;
    private final e52<fo> h;

    public hp0(e52<Executor> e52, e52<Context> e522, e52<WeakReference<Context>> e523, e52<Executor> e524, e52<rl0> e525, e52<ScheduledExecutorService> e526, e52<eo0> e527, e52<fo> e528) {
        this.f2957a = e52;
        this.f2958b = e522;
        this.f2959c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new uo0(this.f2957a.get(), this.f2958b.get(), this.f2959c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
