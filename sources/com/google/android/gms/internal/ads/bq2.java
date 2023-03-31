package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.o;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.q;
import com.google.android.gms.ads.r.a;
import com.google.android.gms.ads.r.c;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bq2 {

    /* renamed from: a  reason: collision with root package name */
    private final oa f1993a;

    /* renamed from: b  reason: collision with root package name */
    private final p f1994b;

    /* renamed from: c  reason: collision with root package name */
    private final nn2 f1995c;
    private jm2 d;
    private b e;
    private e[] f;
    private a g;
    private eo2 h;
    private c i;
    private q j;
    private String k;
    private ViewGroup l;
    private int m;
    private boolean n;
    private l o;

    public bq2(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, sm2.f4681a, i2);
    }

    public bq2(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i2) {
        this(viewGroup, attributeSet, false, sm2.f4681a, i2);
    }

    private bq2(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, sm2 sm2, int i2) {
        this(viewGroup, attributeSet, z, sm2, null, i2);
    }

    private bq2(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, sm2 sm2, eo2 eo2, int i2) {
        um2 um2;
        this.f1993a = new oa();
        this.f1994b = new p();
        this.f1995c = new aq2(this);
        this.l = viewGroup;
        this.h = null;
        new AtomicBoolean(false);
        this.m = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                dn2 dn2 = new dn2(context, attributeSet);
                this.f = dn2.a(z);
                this.k = dn2.a();
                if (viewGroup.isInEditMode()) {
                    sn a2 = on2.a();
                    e eVar = this.f[0];
                    int i3 = this.m;
                    if (eVar.equals(e.o)) {
                        um2 = um2.j();
                    } else {
                        um2 um22 = new um2(context, eVar);
                        um22.k = a(i3);
                        um2 = um22;
                    }
                    a2.a(viewGroup, um2, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                on2.a().a(viewGroup, new um2(context, e.g), e2.getMessage(), e2.getMessage());
            }
        }
    }

    private static um2 a(Context context, e[] eVarArr, int i2) {
        for (e eVar : eVarArr) {
            if (eVar.equals(e.o)) {
                return um2.j();
            }
        }
        um2 um2 = new um2(context, eVarArr);
        um2.k = a(i2);
        return um2;
    }

    private static boolean a(int i2) {
        return i2 == 1;
    }

    public final void a() {
        try {
            if (this.h != null) {
                this.h.destroy();
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(b bVar) {
        this.e = bVar;
        this.f1995c.a(bVar);
    }

    public final void a(l lVar) {
        try {
            this.o = lVar;
            if (this.h != null) {
                this.h.a(new zq2(lVar));
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(q qVar) {
        this.j = qVar;
        try {
            if (this.h != null) {
                this.h.a(qVar == null ? null : new er2(qVar));
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(a aVar) {
        try {
            this.g = aVar;
            if (this.h != null) {
                this.h.a(aVar != null ? new ym2(aVar) : null);
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(c cVar) {
        this.i = cVar;
        try {
            if (this.h != null) {
                this.h.a(cVar != null ? new z(cVar) : null);
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(jm2 jm2) {
        try {
            this.d = jm2;
            if (this.h != null) {
                this.h.a(jm2 != null ? new im2(jm2) : null);
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(zp2 zp2) {
        try {
            if (this.h == null) {
                if ((this.f == null || this.k == null) && this.h == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.l.getContext();
                um2 a2 = a(context, this.f, this.m);
                eo2 eo2 = (eo2) ("search_v2".equals(a2.f4976b) ? new in2(on2.b(), context, a2, this.k).a(context, false) : new en2(on2.b(), context, a2, this.k, this.f1993a).a(context, false));
                this.h = eo2;
                eo2.a(new nm2(this.f1995c));
                if (this.d != null) {
                    this.h.a(new im2(this.d));
                }
                if (this.g != null) {
                    this.h.a(new ym2(this.g));
                }
                if (this.i != null) {
                    this.h.a(new z(this.i));
                }
                if (this.j != null) {
                    this.h.a(new er2(this.j));
                }
                this.h.a(new zq2(this.o));
                this.h.c(this.n);
                try {
                    b.c.b.a.d.a m1 = this.h.m1();
                    if (m1 != null) {
                        this.l.addView((View) b.c.b.a.d.b.Q(m1));
                    }
                } catch (RemoteException e2) {
                    co.d("#007 Could not call remote method.", e2);
                }
            }
            if (this.h.a(sm2.a(this.l.getContext(), zp2))) {
                this.f1993a.a(zp2.n());
            }
        } catch (RemoteException e3) {
            co.d("#007 Could not call remote method.", e3);
        }
    }

    public final void a(String str) {
        if (this.k == null) {
            this.k = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void a(boolean z) {
        this.n = z;
        try {
            if (this.h != null) {
                this.h.c(z);
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(e... eVarArr) {
        if (this.f == null) {
            b(eVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final b b() {
        return this.e;
    }

    public final void b(e... eVarArr) {
        this.f = eVarArr;
        try {
            if (this.h != null) {
                this.h.a(a(this.l.getContext(), this.f, this.m));
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
        this.l.requestLayout();
    }

    public final e c() {
        um2 Z1;
        try {
            if (!(this.h == null || (Z1 = this.h.Z1()) == null)) {
                return Z1.d();
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
        e[] eVarArr = this.f;
        if (eVarArr != null) {
            return eVarArr[0];
        }
        return null;
    }

    public final e[] d() {
        return this.f;
    }

    public final String e() {
        eo2 eo2;
        if (this.k == null && (eo2 = this.h) != null) {
            try {
                this.k = eo2.D1();
            } catch (RemoteException e2) {
                co.d("#007 Could not call remote method.", e2);
            }
        }
        return this.k;
    }

    public final a f() {
        return this.g;
    }

    public final String g() {
        try {
            if (this.h != null) {
                return this.h.V();
            }
            return null;
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final c h() {
        return this.i;
    }

    public final o i() {
        mp2 mp2 = null;
        try {
            if (this.h != null) {
                mp2 = this.h.j();
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
        return o.a(mp2);
    }

    public final p j() {
        return this.f1994b;
    }

    public final q k() {
        return this.j;
    }

    public final void l() {
        try {
            if (this.h != null) {
                this.h.p();
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final void m() {
        try {
            if (this.h != null) {
                this.h.z();
            }
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
        }
    }

    public final rp2 n() {
        eo2 eo2 = this.h;
        if (eo2 == null) {
            return null;
        }
        try {
            return eo2.getVideoController();
        } catch (RemoteException e2) {
            co.d("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
