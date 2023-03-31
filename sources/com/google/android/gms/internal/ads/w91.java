package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.y;
import com.google.android.gms.common.internal.r;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public final class w91 extends do2 implements y, q70, pi2 {

    /* renamed from: b  reason: collision with root package name */
    private final kv f5232b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f5233c;
    private final ViewGroup d;
    private AtomicBoolean e = new AtomicBoolean();
    private final String f;
    private final p91 g;
    private final ea1 h;
    private final fo i;
    private long j;
    private sz k;
    @GuardedBy("this")
    protected h00 l;

    public w91(kv kvVar, Context context, String str, p91 p91, ea1 ea1, fo foVar) {
        this.d = new FrameLayout(context);
        this.f5232b = kvVar;
        this.f5233c = context;
        this.f = str;
        this.g = p91;
        this.h = ea1;
        ea1.a(this);
        this.i = foVar;
    }

    /* access modifiers changed from: private */
    public final q a(h00 h00) {
        boolean f2 = h00.f();
        int intValue = ((Integer) on2.e().a(zr2.f2)).intValue();
        p pVar = new p();
        pVar.d = 50;
        int i2 = 0;
        pVar.f1427a = f2 ? intValue : 0;
        if (!f2) {
            i2 = intValue;
        }
        pVar.f1428b = i2;
        pVar.f1429c = intValue;
        return new q(this.f5233c, pVar, this);
    }

    /* access modifiers changed from: private */
    public static RelativeLayout.LayoutParams b(h00 h00) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(h00.f() ? 11 : 9);
        return layoutParams;
    }

    /* access modifiers changed from: private */
    public final void c(h00 h00) {
        h00.a(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d2 */
    public final void c2() {
        if (this.e.compareAndSet(false, true)) {
            h00 h00 = this.l;
            if (!(h00 == null || h00.m() == null)) {
                this.h.a(this.l.m());
            }
            this.h.a();
            this.d.removeAllViews();
            sz szVar = this.k;
            if (szVar != null) {
                com.google.android.gms.ads.internal.q.f().b(szVar);
            }
            h00 h002 = this.l;
            if (h002 != null) {
                h002.a(com.google.android.gms.ads.internal.q.j().b() - this.j);
            }
            destroy();
        }
    }

    /* access modifiers changed from: private */
    public final um2 e2() {
        return ce1.a(this.f5233c, Collections.singletonList(this.l.j()));
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean D() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String D1() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void E1() {
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void M0() {
        if (this.l != null) {
            this.j = com.google.android.gms.ads.internal.q.j().b();
            int g2 = this.l.g();
            if (g2 > 0) {
                sz szVar = new sz(this.f5232b.b(), com.google.android.gms.ads.internal.q.j());
                this.k = szVar;
                szVar.a(g2, new y91(this));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.y
    public final void Q0() {
        c2();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final no2 S0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String V() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized um2 Z1() {
        r.a("getAdSize must be called on the main UI thread.");
        if (this.l == null) {
            return null;
        }
        return ce1.a(this.f5233c, Collections.singletonList(this.l.j()));
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized String a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(bn2 bn2) {
        this.g.a(bn2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(eh ehVar) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(er2 er2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(io2 io2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(le leVar) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(lp2 lp2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(no2 no2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(qn2 qn2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(re reVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(rn2 rn2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(ti2 ti2) {
        this.h.a(ti2);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(u uVar) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void a(um2 um2) {
        r.a("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(xp2 xp2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized boolean a(rm2 rm2) {
        r.a("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.q.c();
        if (gl.p(this.f5233c) && rm2.t == null) {
            co.b("Failed to load the ad because app ID is missing.");
            this.h.a(8);
            return false;
        } else if (u()) {
            return false;
        } else {
            this.e = new AtomicBoolean();
            return this.g.a(rm2, this.f, new ba1(this), new aa1(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void b(to2 to2) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b2() {
        this.f5232b.a().execute(new z91(this));
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void c(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void destroy() {
        r.a("destroy must be called on the main UI thread.");
        if (this.l != null) {
            this.l.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized rp2 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized mp2 j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final a m1() {
        r.a("getAdFrame must be called on the main UI thread.");
        return b.a(this.d);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void p() {
        r.a("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void s(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rn2 t1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized boolean u() {
        return this.g.u();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final Bundle v() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.pi2
    public final void v0() {
        c2();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void x0() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final synchronized void z() {
        r.a("resume must be called on the main UI thread.");
    }
}
