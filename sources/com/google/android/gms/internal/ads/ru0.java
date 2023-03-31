package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

public final class ru0 implements r42<nu0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<k10> f4548a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<st0> f4549b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<y50> f4550c;
    private final e52<ScheduledExecutorService> d;
    private final e52<ko1> e;

    public ru0(e52<k10> e52, e52<st0> e522, e52<y50> e523, e52<ScheduledExecutorService> e524, e52<ko1> e525) {
        this.f4548a = e52;
        this.f4549b = e522;
        this.f4550c = e523;
        this.d = e524;
        this.e = e525;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new nu0(this.f4548a.get(), this.f4549b.get(), this.f4550c.get(), this.d.get(), this.e.get());
    }
}
