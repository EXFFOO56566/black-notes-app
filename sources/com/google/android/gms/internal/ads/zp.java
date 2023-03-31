package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.r;

public final class zp {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5786a;

    /* renamed from: b  reason: collision with root package name */
    private final gq f5787b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f5788c;
    private tp d;

    private zp(Context context, ViewGroup viewGroup, gq gqVar, tp tpVar) {
        this.f5786a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5788c = viewGroup;
        this.f5787b = gqVar;
        this.d = null;
    }

    public zp(Context context, ViewGroup viewGroup, ws wsVar) {
        this(context, viewGroup, wsVar, null);
    }

    public final void a() {
        r.a("onDestroy must be called from the UI thread.");
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.h();
            this.f5788c.removeView(this.d);
            this.d = null;
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        r.a("The underlay may only be modified from the UI thread.");
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.a(i, i2, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, boolean z, hq hqVar) {
        if (this.d == null) {
            j.a(this.f5787b.g().a(), this.f5787b.C(), "vpr2");
            Context context = this.f5786a;
            gq gqVar = this.f5787b;
            tp tpVar = new tp(context, gqVar, i5, z, gqVar.g().a(), hqVar);
            this.d = tpVar;
            this.f5788c.addView(tpVar, 0, new ViewGroup.LayoutParams(-1, -1));
            this.d.a(i, i2, i3, i4);
            this.f5787b.a(false);
        }
    }

    public final void b() {
        r.a("onPause must be called from the UI thread.");
        tp tpVar = this.d;
        if (tpVar != null) {
            tpVar.i();
        }
    }

    public final tp c() {
        r.a("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }
}
