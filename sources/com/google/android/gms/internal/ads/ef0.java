package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class ef0 implements r42<xe0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<n20> f2413a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2414b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<if0> f2415c;
    private final e52<sf0> d;
    private final e52<gg0> e;
    private final e52<of0> f;
    private final e52<rf0> g;
    private final e52<bj0> h;
    private final e52<zi0> i;
    private final e52<ej0> j;
    private final e52<vi0> k;
    private final e52<dj0> l;
    private final e52<zi> m;
    private final e52<eq1> n;
    private final e52<fo> o;
    private final e52<Context> p;
    private final e52<df0> q;
    private final e52<qz0> r;

    private ef0(e52<n20> e52, e52<Executor> e522, e52<if0> e523, e52<sf0> e524, e52<gg0> e525, e52<of0> e526, e52<rf0> e527, e52<bj0> e528, e52<zi0> e529, e52<ej0> e5210, e52<vi0> e5211, e52<dj0> e5212, e52<zi> e5213, e52<eq1> e5214, e52<fo> e5215, e52<Context> e5216, e52<df0> e5217, e52<qz0> e5218) {
        this.f2413a = e52;
        this.f2414b = e522;
        this.f2415c = e523;
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
        this.n = e5214;
        this.o = e5215;
        this.p = e5216;
        this.q = e5217;
        this.r = e5218;
    }

    public static ef0 a(e52<n20> e52, e52<Executor> e522, e52<if0> e523, e52<sf0> e524, e52<gg0> e525, e52<of0> e526, e52<rf0> e527, e52<bj0> e528, e52<zi0> e529, e52<ej0> e5210, e52<vi0> e5211, e52<dj0> e5212, e52<zi> e5213, e52<eq1> e5214, e52<fo> e5215, e52<Context> e5216, e52<df0> e5217, e52<qz0> e5218) {
        return new ef0(e52, e522, e523, e524, e525, e526, e527, e528, e529, e5210, e5211, e5212, e5213, e5214, e5215, e5216, e5217, e5218);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new xe0(this.f2413a.get(), this.f2414b.get(), this.f2415c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), t42.b(this.h), t42.b(this.i), t42.b(this.j), t42.b(this.k), t42.b(this.l), this.m.get(), this.n.get(), this.o.get(), this.p.get(), this.q.get(), this.r.get());
    }
}
