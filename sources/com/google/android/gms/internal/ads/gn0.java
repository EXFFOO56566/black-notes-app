package com.google.android.gms.internal.ads;

import android.content.Context;

public final class gn0 implements r42<hn0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2784a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<he1> f2785b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<tn0> f2786c;
    private final e52<vd1> d;
    private final e52<id1> e;

    private gn0(e52<Context> e52, e52<he1> e522, e52<tn0> e523, e52<vd1> e524, e52<id1> e525) {
        this.f2784a = e52;
        this.f2785b = e522;
        this.f2786c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static gn0 a(e52<Context> e52, e52<he1> e522, e52<tn0> e523, e52<vd1> e524, e52<id1> e525) {
        return new gn0(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new hn0(this.f2784a.get(), this.f2785b.get(), this.f2786c.get(), this.d.get(), this.e.get());
    }
}
