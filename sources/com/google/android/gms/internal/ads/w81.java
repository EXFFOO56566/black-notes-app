package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class w81 implements y61<t81> {

    /* renamed from: a  reason: collision with root package name */
    private ea f5225a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f5226b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5227c;
    private ApplicationInfo d;

    public w81(ea eaVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f5225a = eaVar;
        this.f5226b = scheduledExecutorService;
        this.f5227c = z;
        this.d = applicationInfo;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<t81> a() {
        if (!f0.f2513b.a().booleanValue()) {
            return yn1.a((Throwable) new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.f5227c) {
            return yn1.a((Throwable) new Exception("Auto Collect Location is false."));
        }
        return yn1.a(yn1.a(this.f5225a.a(this.d), ((Long) on2.e().a(zr2.C1)).longValue(), TimeUnit.MILLISECONDS, this.f5226b), v81.f5064a, jo.f3256a);
    }
}
