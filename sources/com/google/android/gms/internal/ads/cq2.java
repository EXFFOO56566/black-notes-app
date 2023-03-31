package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.n;
import com.google.android.gms.ads.v.a;
import com.google.android.gms.ads.v.b;
import com.google.android.gms.ads.x.c;
import com.google.android.gms.common.internal.r;
import java.util.HashMap;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public final class cq2 {
    @GuardedBy("lock")
    private static cq2 e;
    private static final Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private vo2 f2154a;

    /* renamed from: b  reason: collision with root package name */
    private c f2155b;

    /* renamed from: c  reason: collision with root package name */
    private n f2156c = new n.a().a();
    private b d;

    private cq2() {
    }

    /* access modifiers changed from: private */
    public static b a(List<e6> list) {
        HashMap hashMap = new HashMap();
        for (e6 e6Var : list) {
            hashMap.put(e6Var.f2371b, new m6(e6Var.f2372c ? a.READY : a.NOT_READY, e6Var.e, e6Var.d));
        }
        return new p6(hashMap);
    }

    private final void a(n nVar) {
        try {
            this.f2154a.a(new yq2(nVar));
        } catch (RemoteException e2) {
            co.b("Unable to set request configuration parcel.", e2);
        }
    }

    public static cq2 c() {
        cq2 cq2;
        synchronized (f) {
            if (e == null) {
                e = new cq2();
            }
            cq2 = e;
        }
        return cq2;
    }

    public final n a() {
        return this.f2156c;
    }

    public final c a(Context context) {
        synchronized (f) {
            if (this.f2155b != null) {
                return this.f2155b;
            }
            mh mhVar = new mh(context, (bh) new mn2(on2.b(), context, new oa()).a(context, false));
            this.f2155b = mhVar;
            return mhVar;
        }
    }

    public final void a(Context context, String str, com.google.android.gms.ads.v.c cVar) {
        synchronized (f) {
            if (this.f2154a == null) {
                if (context != null) {
                    try {
                        ja.a().a(context, str);
                        vo2 vo2 = (vo2) new jn2(on2.b(), context).a(context, false);
                        this.f2154a = vo2;
                        if (cVar != null) {
                            vo2.a(new kq2(this, cVar, null));
                        }
                        this.f2154a.a(new oa());
                        this.f2154a.L();
                        this.f2154a.b(str, b.c.b.a.d.b.a(new fq2(this, context)));
                        if (!(this.f2156c.b() == -1 && this.f2156c.c() == -1)) {
                            a(this.f2156c);
                        }
                        zr2.a(context);
                        if (!((Boolean) on2.e().a(zr2.p2)).booleanValue() && !b().endsWith("0")) {
                            co.b("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                            this.d = new iq2(this);
                            if (cVar != null) {
                                sn.f4682b.post(new eq2(this, cVar));
                            }
                        }
                    } catch (RemoteException e2) {
                        co.c("MobileAdsSettingManager initialization failed", e2);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.google.android.gms.ads.v.c cVar) {
        cVar.a(this.d);
    }

    public final String b() {
        r.b(this.f2154a != null, "MobileAds.initialize() must be called prior to getting version string.");
        try {
            return kl1.c(this.f2154a.W1());
        } catch (RemoteException e2) {
            co.b("Unable to get version string.", e2);
            return BuildConfig.FLAVOR;
        }
    }
}
