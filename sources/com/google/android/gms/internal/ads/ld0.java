package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.ik2;
import java.util.HashMap;

public final class ld0 implements o, l70 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3530b;

    /* renamed from: c  reason: collision with root package name */
    private final ws f3531c;
    private final id1 d;
    private final fo e;
    private final ik2.a f;
    private a g;

    public ld0(Context context, ws wsVar, id1 id1, fo foVar, ik2.a aVar) {
        this.f3530b = context;
        this.f3531c = wsVar;
        this.d = id1;
        this.e = foVar;
        this.f = aVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        this.g = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void p() {
        ws wsVar;
        if (this.g != null && (wsVar = this.f3531c) != null) {
            wsVar.a("onSdkImpression", new HashMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        ik2.a aVar = this.f;
        if ((aVar == ik2.a.REWARD_BASED_VIDEO_AD || aVar == ik2.a.INTERSTITIAL) && this.d.J && this.f3531c != null && q.r().b(this.f3530b)) {
            fo foVar = this.e;
            int i = foVar.f2634c;
            int i2 = foVar.d;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            a a2 = q.r().a(sb.toString(), this.f3531c.getWebView(), BuildConfig.FLAVOR, "javascript", this.d.L.optInt("media_type", -1) == 0 ? null : "javascript");
            this.g = a2;
            if (a2 != null && this.f3531c.getView() != null) {
                q.r().a(this.g, this.f3531c.getView());
                this.f3531c.a(this.g);
                q.r().a(this.g);
            }
        }
    }
}
