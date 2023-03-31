package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class d31 implements r42<z21> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2203a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f2204b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f2205c;

    private d31(e52<Context> e52, e52<ScheduledExecutorService> e522, e52<Executor> e523) {
        this.f2203a = e52;
        this.f2204b = e522;
        this.f2205c = e523;
    }

    public static d31 a(e52<Context> e52, e52<ScheduledExecutorService> e522, e52<Executor> e523) {
        return new d31(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new z21(this.f2203a.get(), this.f2204b.get(), this.f2205c.get());
    }
}
