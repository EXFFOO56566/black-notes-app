package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class f81 implements r42<b81> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<dk> f2555a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Integer> f2556b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f2557c;
    private final e52<ik> d;
    private final e52<ScheduledExecutorService> e;
    private final e52<Executor> f;

    public f81(e52<dk> e52, e52<Integer> e522, e52<Context> e523, e52<ik> e524, e52<ScheduledExecutorService> e525, e52<Executor> e526) {
        this.f2555a = e52;
        this.f2556b = e522;
        this.f2557c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new b81(this.f2555a.get(), this.f2556b.get().intValue(), this.f2557c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
