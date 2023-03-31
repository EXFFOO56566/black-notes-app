package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.r.c;
import com.google.android.gms.ads.r.e;
import com.google.android.gms.ads.x.a;
import com.google.android.gms.ads.x.d;

public final class dq2 {

    /* renamed from: a  reason: collision with root package name */
    private final oa f2297a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2298b;

    /* renamed from: c  reason: collision with root package name */
    private b f2299c;
    private jm2 d;
    private eo2 e;
    private String f;
    private a g;
    private com.google.android.gms.ads.r.a h;
    private c i;
    private d j;
    private boolean k;
    private boolean l;
    private l m;

    public dq2(Context context) {
        this(context, sm2.f4681a, null);
    }

    private dq2(Context context, sm2 sm2, e eVar) {
        this.f2297a = new oa();
        this.f2298b = context;
    }

    private final void b(String str) {
        if (this.e == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final Bundle a() {
        try {
            if (this.e != null) {
                return this.e.v();
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }

    public final void a(b bVar) {
        try {
            this.f2299c = bVar;
            if (this.e != null) {
                this.e.a(bVar != null ? new nm2(bVar) : null);
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(a aVar) {
        try {
            this.g = aVar;
            if (this.e != null) {
                this.e.a(aVar != null ? new om2(aVar) : null);
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(d dVar) {
        try {
            this.j = dVar;
            if (this.e != null) {
                this.e.a(dVar != null ? new lh(dVar) : null);
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(jm2 jm2) {
        try {
            this.d = jm2;
            if (this.e != null) {
                this.e.a(jm2 != null ? new im2(jm2) : null);
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(zp2 zp2) {
        try {
            if (this.e == null) {
                if (this.f == null) {
                    b("loadAd");
                }
                um2 g2 = this.k ? um2.g() : new um2();
                cn2 b2 = on2.b();
                Context context = this.f2298b;
                eo2 eo2 = (eo2) new hn2(b2, context, g2, this.f, this.f2297a).a(context, false);
                this.e = eo2;
                if (this.f2299c != null) {
                    eo2.a(new nm2(this.f2299c));
                }
                if (this.d != null) {
                    this.e.a(new im2(this.d));
                }
                if (this.g != null) {
                    this.e.a(new om2(this.g));
                }
                if (this.h != null) {
                    this.e.a(new ym2(this.h));
                }
                if (this.i != null) {
                    this.e.a(new z(this.i));
                }
                if (this.j != null) {
                    this.e.a(new lh(this.j));
                }
                this.e.a(new zq2(this.m));
                this.e.a(this.l);
            }
            if (this.e.a(sm2.a(this.f2298b, zp2))) {
                this.f2297a.a(zp2.n());
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void a(boolean z) {
        try {
            this.l = z;
            if (this.e != null) {
                this.e.a(z);
            }
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void b(boolean z) {
        this.k = true;
    }

    public final boolean b() {
        try {
            if (this.e == null) {
                return false;
            }
            return this.e.D();
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    public final void c() {
        try {
            b("show");
            this.e.showInterstitial();
        } catch (RemoteException e2) {
            co.d("#008 Must be called on the main UI thread.", e2);
        }
    }
}
