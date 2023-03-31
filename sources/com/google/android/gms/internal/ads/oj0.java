package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.overlay.t;

/* access modifiers changed from: package-private */
public final class oj0 implements o, t, l4, n4, jm2 {

    /* renamed from: b  reason: collision with root package name */
    private jm2 f4005b;

    /* renamed from: c  reason: collision with root package name */
    private l4 f4006c;
    private o d;
    private n4 e;
    private t f;

    private oj0() {
    }

    /* synthetic */ oj0(kj0 kj0) {
        this();
    }

    /* access modifiers changed from: private */
    public final synchronized void a(jm2 jm2, l4 l4Var, o oVar, n4 n4Var, t tVar) {
        this.f4005b = jm2;
        this.f4006c = l4Var;
        this.d = oVar;
        this.e = n4Var;
        this.f = tVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void I() {
        if (this.d != null) {
            this.d.I();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.t
    public final synchronized void a() {
        if (this.f != null) {
            this.f.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.l4
    public final synchronized void a(String str, Bundle bundle) {
        if (this.f4006c != null) {
            this.f4006c.a(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.n4
    public final synchronized void a(String str, String str2) {
        if (this.e != null) {
            this.e.a(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final synchronized void l() {
        if (this.f4005b != null) {
            this.f4005b.l();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onPause() {
        if (this.d != null) {
            this.d.onPause();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onResume() {
        if (this.d != null) {
            this.d.onResume();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void p() {
        if (this.d != null) {
            this.d.p();
        }
    }
}
