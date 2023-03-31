package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;

/* access modifiers changed from: package-private */
public final class rz0 implements zn1<n00> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ k10 f4573a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ oz0 f4574b;

    rz0(oz0 oz0, k10 k10) {
        this.f4574b = oz0;
        this.f4573a = k10;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(n00 n00) {
        n00 n002 = n00;
        synchronized (this.f4574b) {
            this.f4574b.n = null;
            if (this.f4574b.m != null) {
                this.f4574b.m.a();
            }
            this.f4574b.m = n002;
            this.f4574b.d.removeAllViews();
            if (n002.h() != null) {
                ViewParent parent = n002.h().getParent();
                if (parent instanceof ViewGroup) {
                    String a2 = this.f4574b.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(a2);
                    sb.append(" already has a parent view. Removing its old parent.");
                    co.d(sb.toString());
                    ((ViewGroup) parent).removeView(n002.h());
                }
            }
            this.f4574b.d.addView(n002.h());
            n002.b();
            this.f4574b.i.c(n002.j());
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        synchronized (this.f4574b) {
            this.f4574b.n = null;
            this.f4573a.b().a(gp0.a(th));
            this.f4574b.i.c(60);
            ie1.a(th, "BannerAdManagerShim.onFailure");
        }
    }
}
