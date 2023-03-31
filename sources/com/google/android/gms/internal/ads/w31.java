package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class w31 implements y61<t31> {

    /* renamed from: a  reason: collision with root package name */
    private ea f5204a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f5205b;

    /* renamed from: c  reason: collision with root package name */
    private yk f5206c;
    private ApplicationInfo d;
    zd1 e;

    public w31(ea eaVar, ScheduledExecutorService scheduledExecutorService, yk ykVar, ApplicationInfo applicationInfo, zd1 zd1) {
        this.f5204a = eaVar;
        this.f5205b = scheduledExecutorService;
        this.f5206c = ykVar;
        this.d = applicationInfo;
        this.e = zd1;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<t31> a() {
        lo1 lo1;
        if (f0.f2512a.a().booleanValue() && this.f5206c.b()) {
            lo1 = yn1.a(yn1.a(this.f5204a.a(this.d), ((Long) on2.e().a(zr2.C1)).longValue(), TimeUnit.MILLISECONDS, this.f5205b), Throwable.class, x31.f5360a, jo.f);
        } else {
            lo1 = yn1.a((Object) null);
        }
        return yn1.a(yn1.a(lo1, new y31(this), this.f5205b), v31.f5046a, jo.f3256a);
    }
}
