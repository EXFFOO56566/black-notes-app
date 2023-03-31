package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.x.a;
import java.util.concurrent.atomic.AtomicReference;

public final class rb1 extends a implements u50, a60, j60, l70, b80, jb1 {

    /* renamed from: b  reason: collision with root package name */
    private final df1 f4472b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<a> f4473c = new AtomicReference<>();
    private final AtomicReference<di> d = new AtomicReference<>();
    private final AtomicReference<bi> e = new AtomicReference<>();
    private final AtomicReference<eh> f = new AtomicReference<>();
    private final AtomicReference<gi> g = new AtomicReference<>();
    private final AtomicReference<zg> h = new AtomicReference<>();
    private final AtomicReference<lp2> i = new AtomicReference<>();
    private rb1 j = null;

    public rb1(df1 df1) {
        this.f4472b = df1;
    }

    public static rb1 a(rb1 rb1) {
        rb1 rb12 = new rb1(rb1.f4472b);
        rb12.a((jb1) rb1);
        return rb12;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void A() {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.f, bc1.f1919a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void B() {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.e, hc1.f2893a);
                cb1.a(rb1.f, gc1.f2735a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void G() {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.f, lc1.f3528a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.ads.x.a
    public final void a() {
        rb1 rb1 = this.j;
        if (rb1 != null) {
            rb1.a();
        } else {
            cb1.a(this.f4473c, dc1.f2240a);
        }
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(int i2) {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.d, new fc1(i2));
                cb1.a(rb1.f, new ec1(i2));
                return;
            }
        }
    }

    public final void a(a aVar) {
        this.f4473c.set(aVar);
    }

    public final void a(bi biVar) {
        this.e.set(biVar);
    }

    public final void a(di diVar) {
        this.d.set(diVar);
    }

    @Deprecated
    public final void a(eh ehVar) {
        this.f.set(ehVar);
    }

    public final void a(gi giVar) {
        this.g.set(giVar);
    }

    @Override // com.google.android.gms.internal.ads.jb1
    public final void a(jb1 jb1) {
        this.j = (rb1) jb1;
    }

    public final void a(lp2 lp2) {
        this.i.set(lp2);
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void a(ug ugVar, String str, String str2) {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.e, new xb1(ugVar));
                cb1.a(rb1.g, new wb1(ugVar, str, str2));
                cb1.a(rb1.f, new zb1(ugVar));
                cb1.a(rb1.h, new yb1(ugVar, str, str2));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void a(wm2 wm2) {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.i, new cc1(wm2));
                return;
            }
        }
    }

    @Deprecated
    public final void a(zg zgVar) {
        this.h.set(zgVar);
    }

    @Override // com.google.android.gms.internal.ads.j60
    public final void d(int i2) {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.e, new ac1(i2));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.d, vb1.f5082a);
                cb1.a(rb1.f, ub1.f4925a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void x() {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                rb1.f4472b.a();
                cb1.a(rb1.e, jc1.f3204a);
                cb1.a(rb1.f, ic1.f3059a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void y() {
        rb1 rb1 = this;
        while (true) {
            rb1 rb12 = rb1.j;
            if (rb12 != null) {
                rb1 = rb12;
            } else {
                cb1.a(rb1.f, kc1.f3370a);
                return;
            }
        }
    }
}
