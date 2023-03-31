package com.google.android.gms.internal.ads;

import a.e.g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import java.util.Arrays;
import java.util.List;

public final class dj0 extends v2 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f2265b;

    /* renamed from: c  reason: collision with root package name */
    private final if0 f2266c;
    private gg0 d;
    private xe0 e;

    public dj0(Context context, if0 if0, gg0 gg0, xe0 xe0) {
        this.f2265b = context;
        this.f2266c = if0;
        this.d = gg0;
        this.e = xe0;
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final boolean C1() {
        a v = this.f2266c.v();
        if (v != null) {
            q.r().a(v);
            return true;
        }
        co.d("Trying to start OMID session before creation.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final void D(a aVar) {
        xe0 xe0;
        Object Q = b.Q(aVar);
        if ((Q instanceof View) && this.f2266c.v() != null && (xe0 = this.e) != null) {
            xe0.c((View) Q);
        }
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final boolean O(a aVar) {
        Object Q = b.Q(aVar);
        if (!(Q instanceof ViewGroup)) {
            return false;
        }
        gg0 gg0 = this.d;
        if (!(gg0 != null && gg0.a((ViewGroup) Q))) {
            return false;
        }
        this.f2266c.t().a(new cj0(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final a P0() {
        return b.a(this.f2265b);
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final boolean X1() {
        xe0 xe0 = this.e;
        return (xe0 == null || xe0.k()) && this.f2266c.u() != null && this.f2266c.t() == null;
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final String Y() {
        return this.f2266c.e();
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final void destroy() {
        xe0 xe0 = this.e;
        if (xe0 != null) {
            xe0.a();
        }
        this.e = null;
        this.d = null;
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final v1 g(String str) {
        return this.f2266c.w().get(str);
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final rp2 getVideoController() {
        return this.f2266c.n();
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final void h1() {
        String x = this.f2266c.x();
        if ("Google".equals(x)) {
            co.d("Illegal argument specified for omid partner name.");
            return;
        }
        xe0 xe0 = this.e;
        if (xe0 != null) {
            xe0.a(x, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final void i() {
        xe0 xe0 = this.e;
        if (xe0 != null) {
            xe0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final void i(String str) {
        xe0 xe0 = this.e;
        if (xe0 != null) {
            xe0.a(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final a n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final List<String> p0() {
        g<String, i1> w = this.f2266c.w();
        g<String, String> y = this.f2266c.y();
        String[] strArr = new String[(w.size() + y.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < w.size()) {
            strArr[i3] = w.b(i2);
            i2++;
            i3++;
        }
        while (i < y.size()) {
            strArr[i3] = y.b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.s2
    public final String w(String str) {
        return this.f2266c.y().get(str);
    }
}
