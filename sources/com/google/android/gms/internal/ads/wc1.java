package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import javax.annotation.concurrent.GuardedBy;

public final class wc1 extends ai {

    /* renamed from: b  reason: collision with root package name */
    private final pc1 f5250b;

    /* renamed from: c  reason: collision with root package name */
    private final rb1 f5251c;
    private final String d;
    private final td1 e;
    private final Context f;
    @GuardedBy("this")
    private ck0 g;

    public wc1(String str, pc1 pc1, Context context, rb1 rb1, td1 td1) {
        this.d = str;
        this.f5250b = pc1;
        this.f5251c = rb1;
        this.e = td1;
        this.f = context;
    }

    private final synchronized void a(rm2 rm2, di diVar, int i) {
        r.a("#008 Must be called on the main UI thread.");
        this.f5251c.a(diVar);
        q.c();
        if (gl.p(this.f) && rm2.t == null) {
            co.b("Failed to load the ad because app ID is missing.");
            this.f5251c.a(8);
        } else if (this.g == null) {
            mc1 mc1 = new mc1(null);
            this.f5250b.a(i);
            this.f5250b.a(rm2, this.d, mc1, new yc1(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final wh I0() {
        r.a("#008 Must be called on the main UI thread.");
        ck0 ck0 = this.g;
        if (ck0 != null) {
            return ck0.i();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final boolean M() {
        r.a("#008 Must be called on the main UI thread.");
        ck0 ck0 = this.g;
        return ck0 != null && !ck0.h();
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final synchronized String a() {
        if (this.g == null || this.g.d() == null) {
            return null;
        }
        return this.g.d().a();
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final synchronized void a(a aVar, boolean z) {
        r.a("#008 Must be called on the main UI thread.");
        if (this.g == null) {
            co.d("Rewarded can not be shown before loaded");
            this.f5251c.d(2);
            return;
        }
        this.g.a(z, (Activity) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(bi biVar) {
        r.a("#008 Must be called on the main UI thread.");
        this.f5251c.a(biVar);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(gi giVar) {
        r.a("#008 Must be called on the main UI thread.");
        this.f5251c.a(giVar);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(gp2 gp2) {
        if (gp2 == null) {
            this.f5251c.a((com.google.android.gms.ads.x.a) null);
        } else {
            this.f5251c.a(new vc1(this, gp2));
        }
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final synchronized void a(ji jiVar) {
        r.a("#008 Must be called on the main UI thread.");
        td1 td1 = this.e;
        td1.f4792a = jiVar.f3231b;
        if (((Boolean) on2.e().a(zr2.n0)).booleanValue()) {
            td1.f4793b = jiVar.f3232c;
        }
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(lp2 lp2) {
        r.a("setOnPaidEventListener must be called on the main UI thread.");
        this.f5251c.a(lp2);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final synchronized void a(rm2 rm2, di diVar) {
        a(rm2, diVar, qd1.f4319b);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final synchronized void b(rm2 rm2, di diVar) {
        a(rm2, diVar, qd1.f4320c);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final mp2 j() {
        ck0 ck0;
        if (((Boolean) on2.e().a(zr2.A3)).booleanValue() && (ck0 = this.g) != null) {
            return ck0.d();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final Bundle v() {
        r.a("#008 Must be called on the main UI thread.");
        ck0 ck0 = this.g;
        return ck0 != null ? ck0.f() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final synchronized void x(a aVar) {
        a(aVar, false);
    }
}
