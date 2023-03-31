package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import b.c.b.a.d.a;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.jm2;

public final class u extends ae {

    /* renamed from: b  reason: collision with root package name */
    private AdOverlayInfoParcel f1432b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f1433c;
    private boolean d = false;
    private boolean e = false;

    public u(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f1432b = adOverlayInfoParcel;
        this.f1433c = activity;
    }

    private final synchronized void b2() {
        if (!this.e) {
            if (this.f1432b.d != null) {
                this.f1432b.d.I();
            }
            this.e = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void K1() {
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void R0() {
        if (this.f1433c.isFinishing()) {
            b2();
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final boolean Y1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void a(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void j(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.d);
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void k(Bundle bundle) {
        o oVar;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f1432b;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                jm2 jm2 = adOverlayInfoParcel.f1412c;
                if (jm2 != null) {
                    jm2.l();
                }
                if (!(this.f1433c.getIntent() == null || !this.f1433c.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (oVar = this.f1432b.d) == null)) {
                    oVar.p();
                }
            }
            q.a();
            Activity activity = this.f1433c;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f1432b;
            if (!b.a(activity, adOverlayInfoParcel2.f1411b, adOverlayInfoParcel2.j)) {
                this.f1433c.finish();
                return;
            }
            return;
        }
        this.f1433c.finish();
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void k1() {
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void m0() {
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onDestroy() {
        if (this.f1433c.isFinishing()) {
            b2();
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onPause() {
        o oVar = this.f1432b.d;
        if (oVar != null) {
            oVar.onPause();
        }
        if (this.f1433c.isFinishing()) {
            b2();
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onResume() {
        if (this.d) {
            this.f1433c.finish();
            return;
        }
        this.d = true;
        o oVar = this.f1432b.d;
        if (oVar != null) {
            oVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void v(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void z1() {
    }
}
