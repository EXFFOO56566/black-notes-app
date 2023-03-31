package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ly0 implements r42<fy0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3620a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<k10> f3621b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<sh1> f3622c;
    private final e52<ko1> d;
    private final e52<u> e;

    public ly0(e52<Context> e52, e52<k10> e522, e52<sh1> e523, e52<ko1> e524, e52<u> e525) {
        this.f3620a = e52;
        this.f3621b = e522;
        this.f3622c = e523;
        this.d = e524;
        this.e = e525;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new fy0(this.f3620a.get(), this.f3621b.get(), this.f3622c.get(), this.d.get(), this.e.get());
    }
}
