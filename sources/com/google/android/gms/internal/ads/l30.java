package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class l30<T> {

    /* renamed from: a  reason: collision with root package name */
    private final dq0 f3488a;

    /* renamed from: b  reason: collision with root package name */
    private final kq0 f3489b;

    /* renamed from: c  reason: collision with root package name */
    private final zd1 f3490c;
    private final sh1 d;
    private final iy e;
    private final sw0<T> f;
    private final x80 g;
    private final vd1 h;
    private final dr0 i;
    private final z40 j;
    private final Executor k;

    l30(dq0 dq0, kq0 kq0, zd1 zd1, sh1 sh1, iy iyVar, sw0<T> sw0, x80 x80, vd1 vd1, dr0 dr0, z40 z40, Executor executor) {
        this.f3488a = dq0;
        this.f3489b = kq0;
        this.f3490c = zd1;
        this.d = sh1;
        this.e = iyVar;
        this.f = sw0;
        this.g = x80;
        this.h = vd1;
        this.i = dr0;
        this.j = z40;
        this.k = executor;
    }

    private final lo1<vd1> b(lo1<zf> lo1) {
        kh1 a2;
        ih1 a3;
        lo1<vd1> a4;
        if (this.h != null) {
            a3 = this.d.a(ph1.SERVER_TRANSACTION);
            a4 = yn1.a(this.h);
        } else {
            q.i().a();
            if (this.f3490c.d.t != null) {
                a3 = this.d.a(ph1.SERVER_TRANSACTION);
                a4 = this.f3489b.a();
            } else {
                a2 = this.d.a(ph1.SERVER_TRANSACTION, lo1).a((ln1) this.f3488a);
                return a2.a();
            }
        }
        a2 = a3.a(a4);
        return a2.a();
    }

    public final lo1<vd1> a() {
        return b(this.j.b());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.vr2 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.android.gms.internal.ads.vr2 */
    /* JADX WARN: Multi-variable type inference failed */
    public final lo1<T> a(lo1<vd1> lo1) {
        kh1 a2;
        if (((Boolean) on2.e().a(zr2.v2)).booleanValue()) {
            a2 = this.d.a(ph1.RENDERER, lo1).a((ln1) this.e).a((ln1) this.f);
        } else {
            a2 = this.d.a(ph1.RENDERER, lo1).a((ln1) this.e).a((ln1) this.f).a((long) ((Integer) on2.e().a(zr2.w2)).intValue(), TimeUnit.SECONDS);
        }
        return a2.a();
    }

    public final lo1<zf> a(nf1 nf1) {
        bh1 a2 = this.d.a(ph1.GET_CACHE_KEY, this.j.b()).a((ln1) new o30(this, nf1)).a();
        yn1.a(a2, new n30(this), this.k);
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(nf1 nf1, zf zfVar) {
        zfVar.k = nf1;
        return this.i.a(zfVar);
    }

    public final lo1<vd1> a(zf zfVar) {
        return b(yn1.a(zfVar));
    }

    public final lo1<T> b() {
        return a(a());
    }

    public final lo1<T> b(zf zfVar) {
        return a(a(zfVar));
    }

    public final lo1<Void> c(zf zfVar) {
        bh1 a2 = this.d.a(ph1.NOTIFY_CACHE_HIT, this.i.b(zfVar)).a();
        yn1.a(a2, new q30(this), this.k);
        return a2;
    }

    public final x80 c() {
        return this.g;
    }
}
