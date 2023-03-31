package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class b61 implements r42<y51> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f1873a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f1874b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<String> f1875c;
    private final e52<ez0> d;
    private final e52<Context> e;
    private final e52<zd1> f;
    private final e52<cz0> g;

    private b61(e52<ko1> e52, e52<ScheduledExecutorService> e522, e52<String> e523, e52<ez0> e524, e52<Context> e525, e52<zd1> e526, e52<cz0> e527) {
        this.f1873a = e52;
        this.f1874b = e522;
        this.f1875c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
    }

    public static b61 a(e52<ko1> e52, e52<ScheduledExecutorService> e522, e52<String> e523, e52<ez0> e524, e52<Context> e525, e52<zd1> e526, e52<cz0> e527) {
        return new b61(e52, e522, e523, e524, e525, e526, e527);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new y51(this.f1873a.get(), this.f1874b.get(), this.f1875c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
