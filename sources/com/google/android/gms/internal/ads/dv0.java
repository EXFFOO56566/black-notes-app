package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class dv0 implements id0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2322a;

    /* renamed from: b  reason: collision with root package name */
    private final fo f2323b;

    /* renamed from: c  reason: collision with root package name */
    private final lo1<cc0> f2324c;
    private final id1 d;
    private final ws e;

    private dv0(Context context, fo foVar, lo1<cc0> lo1, id1 id1, ws wsVar) {
        this.f2322a = context;
        this.f2323b = foVar;
        this.f2324c = lo1;
        this.d = id1;
        this.e = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void a(boolean z, Context context) {
        this.e.g(true);
        q.c();
        g gVar = new g(false, gl.n(this.f2322a), false, 0.0f, -1, z, this.d.F, false);
        q.b();
        yc0 k = ((cc0) yn1.b(this.f2324c)).k();
        ws wsVar = this.e;
        id1 id1 = this.d;
        int i = id1.H;
        fo foVar = this.f2323b;
        String str = id1.y;
        md1 md1 = id1.p;
        n.a(context, new AdOverlayInfoParcel((jm2) null, k, (t) null, wsVar, i, foVar, str, gVar, md1.f3693b, md1.f3692a), true);
    }
}
