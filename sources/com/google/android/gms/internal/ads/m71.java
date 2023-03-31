package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class m71 implements y61<j71> {

    /* renamed from: a  reason: collision with root package name */
    private final dk f3673a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3674b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f3675c;
    private final Executor d;

    public m71(dk dkVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f3673a = dkVar;
        this.f3674b = context;
        this.f3675c = scheduledExecutorService;
        this.d = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ j71 a(Throwable th) {
        on2.a();
        return new j71(null, sn.b(this.f3674b));
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<j71> a() {
        if (!((Boolean) on2.e().a(zr2.q0)).booleanValue()) {
            return yn1.a((Throwable) new Exception("Did not ad Ad ID into query param."));
        }
        return tn1.b((lo1) this.f3673a.a(this.f3674b)).a(l71.f3504a, this.d).a(((Long) on2.e().a(zr2.r0)).longValue(), TimeUnit.MILLISECONDS, this.f3675c).a(Throwable.class, new p71(this), this.d);
    }
}
