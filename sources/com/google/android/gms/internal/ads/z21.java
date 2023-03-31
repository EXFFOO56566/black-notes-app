package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class z21 implements y61<w21> {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f5687a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5688b;

    public z21(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f5687a = scheduledExecutorService;
        this.f5688b = executor;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<w21> a() {
        if (!((Boolean) on2.e().a(zr2.e3)).booleanValue()) {
            return yn1.a((Object) null);
        }
        ro roVar = new ro();
        try {
            new y21(roVar).a(false);
        } catch (Throwable unused) {
            co.b("ArCoreApk is not ready.");
            roVar.b(false);
        }
        return yn1.a(yn1.a(yn1.a(roVar, 200, TimeUnit.MILLISECONDS, this.f5687a), new b31(this), this.f5688b), Throwable.class, a31.f1688a, this.f5688b);
    }
}
