package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.Collections;

public final class kz0 extends do2 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3471b;

    /* renamed from: c  reason: collision with root package name */
    private final rn2 f3472c;
    private final zd1 d;
    private final n00 e;
    private final ViewGroup f;

    public kz0(Context context, rn2 rn2, zd1 zd1, n00 n00) {
        this.f3471b = context;
        this.f3472c = rn2;
        this.d = zd1;
        this.e = n00;
        FrameLayout frameLayout = new FrameLayout(this.f3471b);
        frameLayout.removeAllViews();
        frameLayout.addView(this.e.h(), q.e().b());
        frameLayout.setMinimumHeight(Z1().d);
        frameLayout.setMinimumWidth(Z1().g);
        this.f = frameLayout;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean D() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String D1() {
        return this.d.f;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void E1() {
        this.e.k();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final no2 S0() {
        return this.d.m;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String V() {
        if (this.e.d() != null) {
            return this.e.d().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final um2 Z1() {
        r.a("getAdSize must be called on the main UI thread.");
        return ce1.a(this.f3471b, Collections.singletonList(this.e.g()));
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String a() {
        if (this.e.d() != null) {
            return this.e.d().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(bn2 bn2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(eh ehVar) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(er2 er2) {
        co.c("setVideoOptions is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(io2 io2) {
        co.c("setAdMetadataListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(le leVar) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(lp2 lp2) {
        co.c("setOnPaidEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(no2 no2) {
        co.c("setAppEventListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(qn2 qn2) {
        co.c("setAdClickListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(re reVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(rn2 rn2) {
        co.c("setAdListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(ti2 ti2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(u uVar) {
        co.c("setOnCustomRenderedAdLoadedListener is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(um2 um2) {
        r.a("setAdSize must be called on the main UI thread.");
        n00 n00 = this.e;
        if (n00 != null) {
            n00.a(this.f, um2);
        }
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(xp2 xp2) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean a(rm2 rm2) {
        co.c("loadAd is not supported for a Publisher AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void b(to2 to2) {
        co.c("setCorrelationIdProvider is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(boolean z) {
        co.c("setManualImpressionsEnabled is not supported in Publisher AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void destroy() {
        r.a("destroy must be called on the main UI thread.");
        this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rp2 getVideoController() {
        return this.e.f();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final mp2 j() {
        return this.e.d();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final a m1() {
        return b.a(this.f);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void p() {
        r.a("destroy must be called on the main UI thread.");
        this.e.c().a((Context) null);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void s(String str) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void showInterstitial() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rn2 t1() {
        return this.f3472c;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean u() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final Bundle v() {
        co.c("getAdMetadata is not supported in Publisher AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void x0() {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void z() {
        r.a("destroy must be called on the main UI thread.");
        this.e.c().b(null);
    }
}
