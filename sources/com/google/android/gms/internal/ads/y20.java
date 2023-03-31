package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class y20 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5524a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f5525b;

    /* renamed from: c  reason: collision with root package name */
    private final lo1<q20> f5526c;
    private volatile boolean d = true;

    public y20(Executor executor, ScheduledExecutorService scheduledExecutorService, lo1<q20> lo1) {
        this.f5524a = executor;
        this.f5525b = scheduledExecutorService;
        this.f5526c = lo1;
    }

    /* access modifiers changed from: private */
    public final void a(List<? extends lo1<? extends k20>> list, zn1<k20> zn1) {
        if (list == null || list.isEmpty()) {
            this.f5524a.execute(new x20(zn1));
            return;
        }
        lo1 a2 = yn1.a((Object) null);
        Iterator<? extends lo1<? extends k20>> it = list.iterator();
        while (it.hasNext()) {
            a2 = yn1.a(yn1.a(a2, Throwable.class, new a30(zn1), this.f5524a), new z20(this, zn1, (lo1) it.next()), this.f5524a);
        }
        yn1.a(a2, new e30(this, zn1), this.f5524a);
    }

    /* access modifiers changed from: private */
    public final void c() {
        jo.e.execute(new c30(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(zn1 zn1, lo1 lo1, k20 k20) {
        if (k20 != null) {
            zn1.a(k20);
        }
        return yn1.a(lo1, a1.f1672a.a().longValue(), TimeUnit.MILLISECONDS, this.f5525b);
    }

    public final void a(zn1<k20> zn1) {
        yn1.a(this.f5526c, new b30(this, zn1), this.f5524a);
    }

    public final boolean a() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.d = false;
    }
}
