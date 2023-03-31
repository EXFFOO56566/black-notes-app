package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.common.internal.r;
import javax.annotation.concurrent.GuardedBy;

public final class cd1 extends ah {

    /* renamed from: b  reason: collision with root package name */
    private final pc1 f2101b;

    /* renamed from: c  reason: collision with root package name */
    private final rb1 f2102c;
    private final td1 d;
    @GuardedBy("this")
    private ck0 e;
    @GuardedBy("this")
    private boolean f = false;

    public cd1(pc1 pc1, rb1 rb1, td1 td1) {
        this.f2101b = pc1;
        this.f2102c = rb1;
        this.d = td1;
    }

    private final synchronized boolean b2() {
        return this.e != null && !this.e.g();
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void M(a aVar) {
        r.a("destroy must be called on the main UI thread.");
        Context context = null;
        this.f2102c.a((com.google.android.gms.ads.x.a) null);
        if (this.e != null) {
            if (aVar != null) {
                context = (Context) b.Q(aVar);
            }
            this.e.c().d(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final boolean M() {
        r.a("isLoaded must be called on the main UI thread.");
        return b2();
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void P() {
        p(null);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final boolean S1() {
        ck0 ck0 = this.e;
        return ck0 != null && ck0.j();
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized String a() {
        if (this.e == null || this.e.d() == null) {
            return null;
        }
        return this.e.d().a();
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(eh ehVar) {
        r.a("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f2102c.a(ehVar);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(io2 io2) {
        r.a("setAdMetadataListener can only be called from the UI thread.");
        if (io2 == null) {
            this.f2102c.a((com.google.android.gms.ads.x.a) null);
        } else {
            this.f2102c.a(new ed1(this, io2));
        }
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void a(kh khVar) {
        r.a("loadAd must be called on the main UI thread.");
        if (!d.a(khVar.f3391c)) {
            if (b2()) {
                if (!((Boolean) on2.e().a(zr2.s2)).booleanValue()) {
                    return;
                }
            }
            mc1 mc1 = new mc1(null);
            this.e = null;
            this.f2101b.a(qd1.f4318a);
            this.f2101b.a(khVar.f3390b, khVar.f3391c, mc1, new bd1(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(zg zgVar) {
        r.a("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f2102c.a(zgVar);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void a(boolean z) {
        r.a("setImmersiveMode must be called on the main UI thread.");
        this.f = z;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void c(String str) {
        r.a("setUserId must be called on the main UI thread.");
        this.d.f4792a = str;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void destroy() {
        M(null);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized mp2 j() {
        if (!((Boolean) on2.e().a(zr2.A3)).booleanValue()) {
            return null;
        }
        if (this.e == null) {
            return null;
        }
        return this.e.d();
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void k(String str) {
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void l(a aVar) {
        r.a("resume must be called on the main UI thread.");
        if (this.e != null) {
            this.e.c().b(aVar == null ? null : (Context) b.Q(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void p() {
        r(null);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void p(a aVar) {
        Activity activity;
        r.a("showAd must be called on the main UI thread.");
        if (this.e != null) {
            if (aVar != null) {
                Object Q = b.Q(aVar);
                if (Q instanceof Activity) {
                    activity = (Activity) Q;
                    this.e.a(this.f, activity);
                }
            }
            activity = null;
            this.e.a(this.f, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void r(a aVar) {
        r.a("pause must be called on the main UI thread.");
        if (this.e != null) {
            this.e.c().a(aVar == null ? null : (Context) b.Q(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final Bundle v() {
        r.a("getAdMetadata can only be called from the UI thread.");
        ck0 ck0 = this.e;
        return ck0 != null ? ck0.f() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final synchronized void v(String str) {
        if (((Boolean) on2.e().a(zr2.n0)).booleanValue()) {
            r.a("#008 Must be called on the main UI thread.: setCustomData");
            this.d.f4793b = str;
        }
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void z() {
        l(null);
    }
}
