package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class n71 implements r42<m71> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<dk> f3803a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f3804b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f3805c;
    private final e52<Executor> d;

    public n71(e52<dk> e52, e52<Context> e522, e52<ScheduledExecutorService> e523, e52<Executor> e524) {
        this.f3803a = e52;
        this.f3804b = e522;
        this.f3805c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new m71(this.f3803a.get(), this.f3804b.get(), this.f3805c.get(), this.d.get());
    }
}
