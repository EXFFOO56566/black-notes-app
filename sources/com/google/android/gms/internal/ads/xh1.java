package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class xh1 implements r42<sh1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f5430a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f5431b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<rh1> f5432c;

    private xh1(e52<ko1> e52, e52<ScheduledExecutorService> e522, e52<rh1> e523) {
        this.f5430a = e52;
        this.f5431b = e522;
        this.f5432c = e523;
    }

    public static xh1 a(e52<ko1> e52, e52<ScheduledExecutorService> e522, e52<rh1> e523) {
        return new xh1(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new sh1(this.f5430a.get(), this.f5431b.get(), this.f5432c.get());
    }
}
