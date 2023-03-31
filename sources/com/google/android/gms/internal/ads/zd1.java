package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.s.d;
import com.google.android.gms.ads.s.j;
import java.util.ArrayList;

public final class zd1 {

    /* renamed from: a  reason: collision with root package name */
    public final to2 f5736a;

    /* renamed from: b  reason: collision with root package name */
    public final er2 f5737b;

    /* renamed from: c  reason: collision with root package name */
    public final q6 f5738c;
    public final rm2 d;
    public final um2 e;
    public final String f;
    public final ArrayList<String> g;
    public final ArrayList<String> h;
    public final m1 i;
    public final bn2 j;
    public final int k;
    public final j l;
    public final no2 m;
    public final ld1 n;
    public final boolean o;

    private zd1(be1 be1) {
        this.e = be1.a(be1);
        this.f = be1.b(be1);
        this.f5736a = be1.c(be1);
        this.d = new rm2(be1.m(be1).f4520b, be1.m(be1).f4521c, be1.m(be1).d, be1.m(be1).e, be1.m(be1).f, be1.m(be1).g, be1.m(be1).h, be1.m(be1).i || be1.n(be1), be1.m(be1).j, be1.m(be1).k, be1.m(be1).l, be1.m(be1).m, be1.m(be1).n, be1.m(be1).o, be1.m(be1).p, be1.m(be1).q, be1.m(be1).r, be1.m(be1).s, be1.m(be1).t, be1.m(be1).u, be1.m(be1).v, be1.m(be1).w);
        this.f5737b = be1.o(be1) != null ? be1.o(be1) : be1.p(be1) != null ? be1.p(be1).g : null;
        this.g = be1.d(be1);
        this.h = be1.e(be1);
        this.i = be1.d(be1) == null ? null : be1.p(be1) == null ? new m1(new d.a().a()) : be1.p(be1);
        this.j = be1.f(be1);
        this.k = be1.g(be1);
        this.l = be1.h(be1);
        this.m = be1.i(be1);
        this.f5738c = be1.j(be1);
        this.n = new ld1(be1.k(be1));
        this.o = be1.l(be1);
    }

    public final r3 a() {
        j jVar = this.l;
        if (jVar == null) {
            return null;
        }
        return jVar.g();
    }
}
