package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

public final class a41 implements r42<w31> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ea> f1692a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f1693b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<yk> f1694c;
    private final e52<ApplicationInfo> d;
    private final e52<zd1> e;

    private a41(e52<ea> e52, e52<ScheduledExecutorService> e522, e52<yk> e523, e52<ApplicationInfo> e524, e52<zd1> e525) {
        this.f1692a = e52;
        this.f1693b = e522;
        this.f1694c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static a41 a(e52<ea> e52, e52<ScheduledExecutorService> e522, e52<yk> e523, e52<ApplicationInfo> e524, e52<zd1> e525) {
        return new a41(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new w31(this.f1692a.get(), this.f1693b.get(), this.f1694c.get(), this.d.get(), this.e.get());
    }
}
