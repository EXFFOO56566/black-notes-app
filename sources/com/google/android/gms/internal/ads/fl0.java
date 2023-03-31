package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.c;
import java.util.concurrent.Executor;

public final class fl0 implements r42<sk0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<t50> f2616a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<v60> f2617b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<k70> f2618c;
    private final e52<t70> d;
    private final e52<w80> e;
    private final e52<Executor> f;
    private final e52<za0> g;
    private final e52<ez> h;
    private final e52<c> i;
    private final e52<p60> j;
    private final e52<vi> k;
    private final e52<eq1> l;
    private final e52<l80> m;

    private fl0(e52<t50> e52, e52<v60> e522, e52<k70> e523, e52<t70> e524, e52<w80> e525, e52<Executor> e526, e52<za0> e527, e52<ez> e528, e52<c> e529, e52<p60> e5210, e52<vi> e5211, e52<eq1> e5212, e52<l80> e5213) {
        this.f2616a = e52;
        this.f2617b = e522;
        this.f2618c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
        this.i = e529;
        this.j = e5210;
        this.k = e5211;
        this.l = e5212;
        this.m = e5213;
    }

    public static fl0 a(e52<t50> e52, e52<v60> e522, e52<k70> e523, e52<t70> e524, e52<w80> e525, e52<Executor> e526, e52<za0> e527, e52<ez> e528, e52<c> e529, e52<p60> e5210, e52<vi> e5211, e52<eq1> e5212, e52<l80> e5213) {
        return new fl0(e52, e522, e523, e524, e525, e526, e527, e528, e529, e5210, e5211, e5212, e5213);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new sk0(this.f2616a.get(), this.f2617b.get(), this.f2618c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get(), this.m.get());
    }
}
