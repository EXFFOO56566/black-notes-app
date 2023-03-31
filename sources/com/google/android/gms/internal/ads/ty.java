package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import javax.annotation.concurrent.GuardedBy;

public final class ty implements u50, n60, l70, jm2 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4877b;

    /* renamed from: c  reason: collision with root package name */
    private final vd1 f4878c;
    private final id1 d;
    private final ci1 e;
    private final eq1 f;
    private final View g;
    @GuardedBy("this")
    private boolean h;
    @GuardedBy("this")
    private boolean i;

    public ty(Context context, vd1 vd1, id1 id1, ci1 ci1, View view, eq1 eq1) {
        this.f4877b = context;
        this.f4878c = vd1;
        this.d = id1;
        this.e = ci1;
        this.f = eq1;
        this.g = view;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void A() {
        ci1 ci1 = this.e;
        vd1 vd1 = this.f4878c;
        id1 id1 = this.d;
        ci1.a(vd1, id1, id1.i);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void B() {
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void G() {
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final synchronized void K() {
        if (!this.i) {
            String str = null;
            if (((Boolean) on2.e().a(zr2.p1)).booleanValue()) {
                str = this.f.a().a(this.f4877b, this.g, (Activity) null);
            }
            this.e.a(this.f4878c, this.d, false, str, this.d.d);
            this.i = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void a(ug ugVar, String str, String str2) {
        ci1 ci1 = this.e;
        vd1 vd1 = this.f4878c;
        id1 id1 = this.d;
        ci1.a(vd1, id1, id1.h, ugVar);
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final void l() {
        ci1 ci1 = this.e;
        vd1 vd1 = this.f4878c;
        id1 id1 = this.d;
        ci1.a(vd1, id1, id1.f3068c);
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final synchronized void s() {
        if (this.h) {
            ArrayList arrayList = new ArrayList(this.d.d);
            arrayList.addAll(this.d.f);
            this.e.a(this.f4878c, this.d, true, null, arrayList);
        } else {
            this.e.a(this.f4878c, this.d, this.d.m);
            this.e.a(this.f4878c, this.d, this.d.f);
        }
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void x() {
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void y() {
        ci1 ci1 = this.e;
        vd1 vd1 = this.f4878c;
        id1 id1 = this.d;
        ci1.a(vd1, id1, id1.g);
    }
}
