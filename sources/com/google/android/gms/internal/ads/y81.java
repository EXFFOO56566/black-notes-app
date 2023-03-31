package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

public final class y81 implements r42<w81> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ea> f5550a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f5551b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Boolean> f5552c;
    private final e52<ApplicationInfo> d;

    public y81(e52<ea> e52, e52<ScheduledExecutorService> e522, e52<Boolean> e523, e52<ApplicationInfo> e524) {
        this.f5550a = e52;
        this.f5551b = e522;
        this.f5552c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new w81(this.f5550a.get(), this.f5551b.get(), this.f5552c.get().booleanValue(), this.d.get());
    }
}
