package com.google.android.gms.internal.ads;

import a.e.g;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import java.util.Collections;
import java.util.List;

public final class if0 {

    /* renamed from: a  reason: collision with root package name */
    private int f3070a;

    /* renamed from: b  reason: collision with root package name */
    private rp2 f3071b;

    /* renamed from: c  reason: collision with root package name */
    private o1 f3072c;
    private View d;
    private List<?> e;
    private List<lq2> f = Collections.emptyList();
    private lq2 g;
    private Bundle h;
    private ws i;
    private ws j;
    private a k;
    private View l;
    private a m;
    private double n;
    private v1 o;
    private v1 p;
    private String q;
    private g<String, i1> r = new g<>();
    private g<String, String> s = new g<>();
    private float t;
    private String u;

    private static ff0 a(rp2 rp2, hb hbVar) {
        if (rp2 == null) {
            return null;
        }
        return new ff0(rp2, hbVar);
    }

    public static if0 a(ab abVar) {
        try {
            ff0 a2 = a(abVar.getVideoController(), (hb) null);
            o1 e2 = abVar.e();
            String b2 = abVar.b();
            List<?> h2 = abVar.h();
            String d2 = abVar.d();
            Bundle g2 = abVar.g();
            String f2 = abVar.f();
            a c2 = abVar.c();
            String r2 = abVar.r();
            String o2 = abVar.o();
            double k2 = abVar.k();
            v1 t2 = abVar.t();
            if0 if0 = new if0();
            if0.f3070a = 2;
            if0.f3071b = a2;
            if0.f3072c = e2;
            if0.d = (View) b(abVar.C());
            if0.a("headline", b2);
            if0.e = h2;
            if0.a("body", d2);
            if0.h = g2;
            if0.a("call_to_action", f2);
            if0.l = (View) b(abVar.w());
            if0.m = c2;
            if0.a("store", r2);
            if0.a("price", o2);
            if0.n = k2;
            if0.o = t2;
            return if0;
        } catch (RemoteException e3) {
            co.c("Failed to get native ad from app install ad mapper", e3);
            return null;
        }
    }

    public static if0 a(gb gbVar) {
        try {
            ff0 a2 = a(gbVar.getVideoController(), (hb) null);
            o1 e2 = gbVar.e();
            String b2 = gbVar.b();
            List<?> h2 = gbVar.h();
            String d2 = gbVar.d();
            Bundle g2 = gbVar.g();
            String f2 = gbVar.f();
            a c2 = gbVar.c();
            String q2 = gbVar.q();
            v1 d0 = gbVar.d0();
            if0 if0 = new if0();
            if0.f3070a = 1;
            if0.f3071b = a2;
            if0.f3072c = e2;
            if0.d = (View) b(gbVar.C());
            if0.a("headline", b2);
            if0.e = h2;
            if0.a("body", d2);
            if0.h = g2;
            if0.a("call_to_action", f2);
            if0.l = (View) b(gbVar.w());
            if0.m = c2;
            if0.a("advertiser", q2);
            if0.p = d0;
            return if0;
        } catch (RemoteException e3) {
            co.c("Failed to get native ad from content ad mapper", e3);
            return null;
        }
    }

    public static if0 a(hb hbVar) {
        try {
            return a(a(hbVar.getVideoController(), hbVar), hbVar.e(), (View) b(hbVar.C()), hbVar.b(), hbVar.h(), hbVar.d(), hbVar.g(), hbVar.f(), (View) b(hbVar.w()), hbVar.c(), hbVar.r(), hbVar.o(), hbVar.k(), hbVar.t(), hbVar.q(), hbVar.L0());
        } catch (RemoteException e2) {
            co.c("Failed to get native ad assets from unified ad mapper", e2);
            return null;
        }
    }

    private static if0 a(rp2 rp2, o1 o1Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, a aVar, String str4, String str5, double d2, v1 v1Var, String str6, float f2) {
        if0 if0 = new if0();
        if0.f3070a = 6;
        if0.f3071b = rp2;
        if0.f3072c = o1Var;
        if0.d = view;
        if0.a("headline", str);
        if0.e = list;
        if0.a("body", str2);
        if0.h = bundle;
        if0.a("call_to_action", str3);
        if0.l = view2;
        if0.m = aVar;
        if0.a("store", str4);
        if0.a("price", str5);
        if0.n = d2;
        if0.o = v1Var;
        if0.a("advertiser", str6);
        if0.a(f2);
        return if0;
    }

    private final synchronized void a(float f2) {
        this.t = f2;
    }

    public static if0 b(ab abVar) {
        try {
            return a(a(abVar.getVideoController(), (hb) null), abVar.e(), (View) b(abVar.C()), abVar.b(), abVar.h(), abVar.d(), abVar.g(), abVar.f(), (View) b(abVar.w()), abVar.c(), abVar.r(), abVar.o(), abVar.k(), abVar.t(), null, 0.0f);
        } catch (RemoteException e2) {
            co.c("Failed to get native ad assets from app install ad mapper", e2);
            return null;
        }
    }

    public static if0 b(gb gbVar) {
        try {
            return a(a(gbVar.getVideoController(), (hb) null), gbVar.e(), (View) b(gbVar.C()), gbVar.b(), gbVar.h(), gbVar.d(), gbVar.g(), gbVar.f(), (View) b(gbVar.w()), gbVar.c(), null, null, -1.0d, gbVar.d0(), gbVar.q(), 0.0f);
        } catch (RemoteException e2) {
            co.c("Failed to get native ad assets from content ad mapper", e2);
            return null;
        }
    }

    private static <T> T b(a aVar) {
        if (aVar == null) {
            return null;
        }
        return (T) b.Q(aVar);
    }

    private final synchronized String c(String str) {
        return this.s.get(str);
    }

    public final synchronized o1 A() {
        return this.f3072c;
    }

    public final synchronized a B() {
        return this.m;
    }

    public final synchronized v1 C() {
        return this.p;
    }

    public final synchronized void a() {
        if (this.i != null) {
            this.i.destroy();
            this.i = null;
        }
        if (this.j != null) {
            this.j.destroy();
            this.j = null;
        }
        this.k = null;
        this.r.clear();
        this.s.clear();
        this.f3071b = null;
        this.f3072c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final synchronized void a(double d2) {
        this.n = d2;
    }

    public final synchronized void a(int i2) {
        this.f3070a = i2;
    }

    public final synchronized void a(View view) {
        this.l = view;
    }

    public final synchronized void a(a aVar) {
        this.k = aVar;
    }

    public final synchronized void a(lq2 lq2) {
        this.g = lq2;
    }

    public final synchronized void a(o1 o1Var) {
        this.f3072c = o1Var;
    }

    public final synchronized void a(rp2 rp2) {
        this.f3071b = rp2;
    }

    public final synchronized void a(v1 v1Var) {
        this.o = v1Var;
    }

    public final synchronized void a(ws wsVar) {
        this.i = wsVar;
    }

    public final synchronized void a(String str) {
        this.q = str;
    }

    public final synchronized void a(String str, i1 i1Var) {
        if (i1Var == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, i1Var);
        }
    }

    public final synchronized void a(String str, String str2) {
        if (str2 == null) {
            this.s.remove(str);
        } else {
            this.s.put(str, str2);
        }
    }

    public final synchronized void a(List<i1> list) {
        this.e = list;
    }

    public final synchronized String b() {
        return c("advertiser");
    }

    public final synchronized void b(v1 v1Var) {
        this.p = v1Var;
    }

    public final synchronized void b(ws wsVar) {
        this.j = wsVar;
    }

    public final synchronized void b(String str) {
        this.u = str;
    }

    public final synchronized void b(List<lq2> list) {
        this.f = list;
    }

    public final synchronized String c() {
        return c("body");
    }

    public final synchronized String d() {
        return c("call_to_action");
    }

    public final synchronized String e() {
        return this.q;
    }

    public final synchronized Bundle f() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final synchronized String g() {
        return c("headline");
    }

    public final synchronized List<?> h() {
        return this.e;
    }

    public final synchronized float i() {
        return this.t;
    }

    public final synchronized List<lq2> j() {
        return this.f;
    }

    public final synchronized String k() {
        return c("price");
    }

    public final synchronized double l() {
        return this.n;
    }

    public final synchronized String m() {
        return c("store");
    }

    public final synchronized rp2 n() {
        return this.f3071b;
    }

    public final synchronized int o() {
        return this.f3070a;
    }

    public final synchronized View p() {
        return this.d;
    }

    public final v1 q() {
        List<?> list = this.e;
        if (!(list == null || list.size() == 0)) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return y1.a((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized lq2 r() {
        return this.g;
    }

    public final synchronized View s() {
        return this.l;
    }

    public final synchronized ws t() {
        return this.i;
    }

    public final synchronized ws u() {
        return this.j;
    }

    public final synchronized a v() {
        return this.k;
    }

    public final synchronized g<String, i1> w() {
        return this.r;
    }

    public final synchronized String x() {
        return this.u;
    }

    public final synchronized g<String, String> y() {
        return this.s;
    }

    public final synchronized v1 z() {
        return this.o;
    }
}
