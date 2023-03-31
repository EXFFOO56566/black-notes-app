package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class b81 implements y61<y71> {

    /* renamed from: a  reason: collision with root package name */
    private final dk f1886a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1887b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1888c;
    private final ik d;
    private final ScheduledExecutorService e;
    private final Executor f;

    public b81(dk dkVar, int i, Context context, ik ikVar, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f1886a = dkVar;
        this.f1887b = i;
        this.f1888c = context;
        this.d = ikVar;
        this.e = scheduledExecutorService;
        this.f = executor;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<y71> a() {
        if (!((Boolean) on2.e().a(zr2.M2)).booleanValue()) {
            return yn1.a((Object) null);
        }
        return tn1.b(yn1.a(new a81(this), this.f)).a(d81.f2225a, this.f).a(((Long) on2.e().a(zr2.r0)).longValue(), TimeUnit.MILLISECONDS, this.e).a(Exception.class, new c81(this), no1.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ y71 a(Exception exc) {
        this.d.a(exc, "ATTESTATION_TOKEN_FETCH");
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 b() {
        return this.f1886a.a(this.f1888c, this.f1887b);
    }
}
