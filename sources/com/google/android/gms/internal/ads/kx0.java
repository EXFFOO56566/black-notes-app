package com.google.android.gms.internal.ads;

import android.content.Context;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class kx0 implements id0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3463a;

    /* renamed from: b  reason: collision with root package name */
    private final pk0 f3464b;

    /* renamed from: c  reason: collision with root package name */
    private final zd1 f3465c;
    private final fo d;
    private final id1 e;
    private final lo1<ek0> f;
    private final ws g;

    private kx0(Context context, pk0 pk0, zd1 zd1, fo foVar, id1 id1, lo1<ek0> lo1, ws wsVar) {
        this.f3463a = context;
        this.f3464b = pk0;
        this.f3465c = zd1;
        this.d = foVar;
        this.e = id1;
        this.f = lo1;
        this.g = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void a(boolean z, Context context) {
        ws wsVar;
        ek0 ek0 = (ek0) yn1.b(this.f);
        try {
            id1 id1 = this.e;
            if (this.g.y()) {
                if (((Boolean) on2.e().a(zr2.j0)).booleanValue()) {
                    ws a2 = this.f3464b.a(this.f3465c.e);
                    o5.a(a2, ek0.l());
                    gl0 gl0 = new gl0();
                    gl0.a(this.f3463a, a2.getView());
                    ek0.h().a(a2, true);
                    a2.P().a(new nx0(gl0, a2));
                    ju P = a2.P();
                    a2.getClass();
                    P.a(mx0.a(a2));
                    a2.a(id1.p.f3693b, id1.p.f3692a, (String) null);
                    wsVar = a2;
                    wsVar.g(true);
                    q.c();
                    boolean n = gl.n(this.f3463a);
                    id1 id12 = this.e;
                    g gVar = new g(false, n, false, 0.0f, -1, z, id12.F, id12.G);
                    q.b();
                    yc0 j = ek0.j();
                    id1 id13 = this.e;
                    int i = id13.H;
                    fo foVar = this.d;
                    String str = id13.y;
                    md1 md1 = id13.p;
                    n.a(context, new AdOverlayInfoParcel((jm2) null, j, (t) null, wsVar, i, foVar, str, gVar, md1.f3693b, md1.f3692a), true);
                }
            }
            wsVar = this.g;
            wsVar.g(true);
            q.c();
            boolean n2 = gl.n(this.f3463a);
            id1 id122 = this.e;
            g gVar2 = new g(false, n2, false, 0.0f, -1, z, id122.F, id122.G);
            q.b();
            yc0 j2 = ek0.j();
            id1 id132 = this.e;
            int i2 = id132.H;
            fo foVar2 = this.d;
            String str2 = id132.y;
            md1 md12 = id132.p;
            n.a(context, new AdOverlayInfoParcel((jm2) null, j2, (t) null, wsVar, i2, foVar2, str2, gVar2, md12.f3693b, md12.f3692a), true);
        } catch (it e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
    }
}
