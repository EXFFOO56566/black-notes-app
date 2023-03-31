package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import b.c.b.a.d.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.k90;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class xz0 extends do2 {

    /* renamed from: b  reason: collision with root package name */
    private final kv f5516b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5517c;
    private final Executor d;
    private final vz0 e = new vz0();
    private final uz0 f = new uz0();
    private final rb1 g = new rb1(new df1());
    private final qz0 h = new qz0();
    @GuardedBy("this")
    private final be1 i;
    @GuardedBy("this")
    private u j;
    @GuardedBy("this")
    private ac0 k;
    @GuardedBy("this")
    private lo1<ac0> l;
    @GuardedBy("this")
    private boolean m;

    public xz0(kv kvVar, Context context, um2 um2, String str) {
        be1 be1 = new be1();
        this.i = be1;
        this.m = false;
        this.f5516b = kvVar;
        be1.a(um2);
        be1.a(str);
        this.d = kvVar.a();
        this.f5517c = context;
    }

    private final synchronized boolean b2() {
        return this.k != null && !this.k.f();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized boolean D() {
        r.a("isLoaded must be called on the main UI thread.");
        return b2();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String D1() {
        return this.i.b();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void E1() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final no2 S0() {
        return this.f.a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String V() {
        if (this.k == null || this.k.d() == null) {
            return null;
        }
        return this.k.d().a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final um2 Z1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String a() {
        if (this.k == null || this.k.d() == null) {
            return null;
        }
        return this.k.d().a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(bn2 bn2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(eh ehVar) {
        this.g.a(ehVar);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(er2 er2) {
        this.i.a(er2);
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
        this.f.a(no2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(qn2 qn2) {
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
        this.j = uVar;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(um2 um2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(xp2 xp2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(boolean z) {
        r.a("setImmersiveMode must be called on the main UI thread.");
        this.m = z;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized boolean a(rm2 rm2) {
        r.a("loadAd must be called on the main UI thread.");
        q.c();
        if (gl.p(this.f5517c) && rm2.t == null) {
            co.b("Failed to load the ad because app ID is missing.");
            if (this.e != null) {
                this.e.a(8);
            }
            return false;
        } else if (this.l != null || b2()) {
            return false;
        } else {
            ie1.a(this.f5517c, rm2.g);
            this.k = null;
            be1 be1 = this.i;
            be1.a(rm2);
            zd1 d2 = be1.d();
            k90.a aVar = new k90.a();
            if (this.g != null) {
                aVar.a((u50) this.g, this.f5516b.a());
                aVar.a((l70) this.g, this.f5516b.a());
                aVar.a((a60) this.g, this.f5516b.a());
            }
            zc0 k2 = this.f5516b.k();
            g50.a aVar2 = new g50.a();
            aVar2.a(this.f5517c);
            aVar2.a(d2);
            k2.c(aVar2.a());
            aVar.a((u50) this.e, this.f5516b.a());
            aVar.a((l70) this.e, this.f5516b.a());
            aVar.a((a60) this.e, this.f5516b.a());
            aVar.a((jm2) this.e, this.f5516b.a());
            aVar.a(this.f, this.f5516b.a());
            aVar.a(this.h, this.f5516b.a());
            k2.c(aVar.a());
            k2.a(new ry0(this.j));
            ad0 e2 = k2.e();
            lo1<ac0> b2 = e2.a().b();
            this.l = b2;
            yn1.a(b2, new wz0(this, e2), this.d);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void b(to2 to2) {
        r.a("setCorrelationIdProvider must be called on the main UI thread");
        this.i.a(to2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void c(boolean z) {
        r.a("setManualImpressionsEnabled must be called from the main thread.");
        this.i.b(z);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void destroy() {
        r.a("destroy must be called on the main UI thread.");
        if (this.k != null) {
            this.k.c().d(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rp2 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized mp2 j() {
        if (!((Boolean) on2.e().a(zr2.A3)).booleanValue()) {
            return null;
        }
        if (this.k == null) {
            return null;
        }
        return this.k.d();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final a m1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void p() {
        r.a("pause must be called on the main UI thread.");
        if (this.k != null) {
            this.k.c().a((Context) null);
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void s(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void showInterstitial() {
        r.a("showInterstitial must be called on the main UI thread.");
        if (this.k != null) {
            this.k.a(this.m);
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rn2 t1() {
        return this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized boolean u() {
        return this.l != null && !this.l.isDone();
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
        if (this.k != null) {
            this.k.c().b(null);
        }
    }
}
