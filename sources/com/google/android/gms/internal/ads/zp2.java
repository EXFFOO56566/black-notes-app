package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.n;
import com.google.android.gms.ads.y.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zp2 {

    /* renamed from: a  reason: collision with root package name */
    private final Date f5789a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5790b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f5791c;
    private final int d;
    private final Set<String> e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map<Class<? extends Object>, Object> i;
    private final String j;
    private final String k;
    private final a l;
    private final int m;
    private final Set<String> n;
    private final Bundle o;
    private final Set<String> p;
    private final boolean q;
    private final com.google.android.gms.ads.w.a r;
    private final int s;
    private final String t;

    public zp2(yp2 yp2) {
        this(yp2, null);
    }

    public zp2(yp2 yp2, a aVar) {
        this.f5789a = yp2.g;
        this.f5790b = yp2.h;
        this.f5791c = yp2.i;
        this.d = yp2.j;
        this.e = Collections.unmodifiableSet(yp2.f5629a);
        this.f = yp2.k;
        this.g = yp2.l;
        this.h = yp2.f5630b;
        this.i = Collections.unmodifiableMap(yp2.f5631c);
        this.j = yp2.m;
        this.k = yp2.n;
        this.l = aVar;
        this.m = yp2.o;
        this.n = Collections.unmodifiableSet(yp2.d);
        this.o = yp2.e;
        this.p = Collections.unmodifiableSet(yp2.f);
        this.q = yp2.p;
        this.r = yp2.q;
        this.s = yp2.r;
        this.t = yp2.s;
    }

    public final Bundle a(Class<? extends Object> cls) {
        return this.h.getBundle(cls.getName());
    }

    @Deprecated
    public final Date a() {
        return this.f5789a;
    }

    public final boolean a(Context context) {
        n a2 = cq2.c().a();
        on2.a();
        String a3 = sn.a(context);
        return this.n.contains(a3) || a2.d().contains(a3);
    }

    public final String b() {
        return this.f5790b;
    }

    public final Bundle c() {
        return this.o;
    }

    @Deprecated
    public final int d() {
        return this.d;
    }

    public final Set<String> e() {
        return this.e;
    }

    public final Location f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final String h() {
        return this.t;
    }

    public final String i() {
        return this.j;
    }

    @Deprecated
    public final boolean j() {
        return this.q;
    }

    public final List<String> k() {
        return new ArrayList(this.f5791c);
    }

    public final String l() {
        return this.k;
    }

    public final a m() {
        return this.l;
    }

    public final Map<Class<? extends Object>, Object> n() {
        return this.i;
    }

    public final Bundle o() {
        return this.h;
    }

    public final int p() {
        return this.m;
    }

    public final Set<String> q() {
        return this.p;
    }

    public final com.google.android.gms.ads.w.a r() {
        return this.r;
    }

    public final int s() {
        return this.s;
    }
}
