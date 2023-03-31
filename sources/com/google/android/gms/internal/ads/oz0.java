package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.k90;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

public final class oz0 extends do2 implements i80 {

    /* renamed from: b  reason: collision with root package name */
    private final kv f4073b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4074c;
    private final ViewGroup d;
    private final vz0 e = new vz0();
    private final sz0 f = new sz0();
    private final uz0 g = new uz0();
    private final qz0 h = new qz0();
    private final e80 i;
    private um2 j;
    @GuardedBy("this")
    private final be1 k = new be1();
    @GuardedBy("this")
    private u l;
    @GuardedBy("this")
    private n00 m;
    @GuardedBy("this")
    private lo1<n00> n;

    public oz0(kv kvVar, Context context, um2 um2, String str) {
        this.d = new FrameLayout(context);
        this.f4073b = kvVar;
        this.f4074c = context;
        be1 be1 = this.k;
        be1.a(um2);
        be1.a(str);
        e80 e2 = kvVar.e();
        this.i = e2;
        e2.a(this, this.f4073b.a());
        this.j = um2;
    }

    private final synchronized k10 a(zd1 zd1) {
        j10 h2;
        h2 = this.f4073b.h();
        g50.a aVar = new g50.a();
        aVar.a(this.f4074c);
        aVar.a(zd1);
        h2.d(aVar.a());
        k90.a aVar2 = new k90.a();
        aVar2.a((jm2) this.e, this.f4073b.a());
        aVar2.a(this.f, this.f4073b.a());
        aVar2.a((u50) this.e, this.f4073b.a());
        aVar2.a((l70) this.e, this.f4073b.a());
        aVar2.a((a60) this.e, this.f4073b.a());
        aVar2.a(this.g, this.f4073b.a());
        aVar2.a(this.h, this.f4073b.a());
        h2.b(aVar2.a());
        h2.b(new ry0(this.l));
        h2.a(new vd0(rf0.h, null));
        h2.a(new h20(this.i));
        h2.a(new i00(this.d));
        return h2.a();
    }

    private final synchronized boolean c(rm2 rm2) {
        r.a("loadAd must be called on the main UI thread.");
        q.c();
        if (gl.p(this.f4074c) && rm2.t == null) {
            co.b("Failed to load the ad because app ID is missing.");
            if (this.e != null) {
                this.e.a(8);
            }
            return false;
        } else if (this.n != null) {
            return false;
        } else {
            ie1.a(this.f4074c, rm2.g);
            be1 be1 = this.k;
            be1.a(rm2);
            zd1 d2 = be1.d();
            if (!s0.f4581b.a().booleanValue() || !this.k.e().l || this.e == null) {
                k10 a2 = a(d2);
                lo1<n00> b2 = a2.a().b();
                this.n = b2;
                yn1.a(b2, new rz0(this, a2), this.f4073b.a());
                return true;
            }
            this.e.a(1);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean D() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String D1() {
        return this.k.b();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void E1() {
        r.a("recordManualImpression must be called on the main UI thread.");
        if (this.m != null) {
            this.m.k();
        }
    }

    @Override // com.google.android.gms.internal.ads.i80
    public final synchronized void J1() {
        boolean z;
        ViewParent parent = this.d.getParent();
        if (!(parent instanceof View)) {
            z = false;
        } else {
            View view = (View) parent;
            z = q.c().a(view, view.getContext());
        }
        if (z) {
            if (!(this.m == null || this.m.i() == null)) {
                this.k.a(ce1.a(this.f4074c, Collections.singletonList(this.m.i())));
            }
            c(this.k.a());
            return;
        }
        this.i.c(60);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final no2 S0() {
        return this.g.a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String V() {
        if (this.m == null || this.m.d() == null) {
            return null;
        }
        return this.m.d().a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized um2 Z1() {
        r.a("getAdSize must be called on the main UI thread.");
        if (this.m != null) {
            return ce1.a(this.f4074c, Collections.singletonList(this.m.g()));
        }
        return this.k.e();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String a() {
        if (this.m == null || this.m.d() == null) {
            return null;
        }
        return this.m.d().a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(bn2 bn2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(eh ehVar) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(er2 er2) {
        r.a("setVideoOptions must be called on the main UI thread.");
        this.k.a(er2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(io2 io2) {
        r.a("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(le leVar) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(lp2 lp2) {
        r.a("setPaidEventListener must be called on the main UI thread.");
        this.h.a(lp2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(no2 no2) {
        r.a("setAppEventListener must be called on the main UI thread.");
        this.g.a(no2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(qn2 qn2) {
        r.a("setAdListener must be called on the main UI thread.");
        this.f.a(qn2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(re reVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(rn2 rn2) {
        r.a("setAdListener must be called on the main UI thread.");
        this.e.a(rn2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(ti2 ti2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(u uVar) {
        r.a("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.l = uVar;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(um2 um2) {
        r.a("setAdSize must be called on the main UI thread.");
        this.k.a(um2);
        this.j = um2;
        if (this.m != null) {
            this.m.a(this.d, um2);
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(xp2 xp2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized boolean a(rm2 rm2) {
        this.k.a(this.j);
        this.k.a(this.j.o);
        return c(rm2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void b(to2 to2) {
        r.a("setCorrelationIdProvider must be called on the main UI thread");
        this.k.a(to2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void c(boolean z) {
        r.a("setManualImpressionsEnabled must be called from the main thread.");
        this.k.b(z);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void destroy() {
        r.a("destroy must be called on the main UI thread.");
        if (this.m != null) {
            this.m.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized rp2 getVideoController() {
        r.a("getVideoController must be called from the main thread.");
        if (this.m == null) {
            return null;
        }
        return this.m.f();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized mp2 j() {
        if (!((Boolean) on2.e().a(zr2.A3)).booleanValue()) {
            return null;
        }
        if (this.m == null) {
            return null;
        }
        return this.m.d();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final a m1() {
        r.a("destroy must be called on the main UI thread.");
        return b.a(this.d);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void p() {
        r.a("pause must be called on the main UI thread.");
        if (this.m != null) {
            this.m.c().a((Context) null);
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void s(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rn2 t1() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized boolean u() {
        return this.n != null && !this.n.isDone();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final Bundle v() {
        r.a("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void x0() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void z() {
        r.a("resume must be called on the main UI thread.");
        if (this.m != null) {
            this.m.c().b(null);
        }
    }
}
