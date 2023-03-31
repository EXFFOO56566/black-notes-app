package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class a91 implements y61<x81> {

    /* renamed from: a  reason: collision with root package name */
    private je f1724a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f1725b;

    /* renamed from: c  reason: collision with root package name */
    private Context f1726c;

    public a91(je jeVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f1724a = jeVar;
        this.f1725b = scheduledExecutorService;
        this.f1726c = context;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<x81> a() {
        return yn1.a(yn1.a(this.f1724a.a(this.f1726c), ((Long) on2.e().a(zr2.H1)).longValue(), TimeUnit.MILLISECONDS, this.f1725b), z81.f5715a, jo.f3256a);
    }
}
