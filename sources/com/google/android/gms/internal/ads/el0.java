package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;

public final class el0 implements r42<pk0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<et> f2442a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2443b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f2444c;
    private final e52<eq1> d;
    private final e52<fo> e;
    private final e52<a> f;
    private final e52<wj2> g;
    private final e52<e80> h;
    private final e52<zb0> i;

    private el0(e52<et> e52, e52<Context> e522, e52<zd1> e523, e52<eq1> e524, e52<fo> e525, e52<a> e526, e52<wj2> e527, e52<e80> e528, e52<zb0> e529) {
        this.f2442a = e52;
        this.f2443b = e522;
        this.f2444c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
        this.i = e529;
    }

    public static el0 a(e52<et> e52, e52<Context> e522, e52<zd1> e523, e52<eq1> e524, e52<fo> e525, e52<a> e526, e52<wj2> e527, e52<e80> e528, e52<zb0> e529) {
        return new el0(e52, e522, e523, e524, e525, e526, e527, e528, e529);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new pk0(this.f2442a.get(), this.f2443b.get(), this.f2444c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get());
    }
}
