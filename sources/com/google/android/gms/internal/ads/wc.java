package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.a0;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.m;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.y;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class wc extends pc {

    /* renamed from: b  reason: collision with root package name */
    private final RtbAdapter f5247b;

    /* renamed from: c  reason: collision with root package name */
    private j f5248c;
    private o d;
    private String e = BuildConfig.FLAVOR;

    public wc(RtbAdapter rtbAdapter) {
        this.f5247b = rtbAdapter;
    }

    private static Bundle A(String str) {
        String valueOf = String.valueOf(str);
        co.d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e2) {
            co.b(BuildConfig.FLAVOR, e2);
            throw new RemoteException();
        }
    }

    private final d<o, Object> a(lc lcVar, xa xaVar) {
        return new cd(this, lcVar, xaVar);
    }

    private static String a(String str, rm2 rm2) {
        String str2 = rm2.v;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private static boolean c(rm2 rm2) {
        if (rm2.g) {
            return true;
        }
        on2.a();
        return sn.a();
    }

    private final Bundle d(rm2 rm2) {
        Bundle bundle;
        Bundle bundle2 = rm2.n;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f5247b.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final boolean B(a aVar) {
        j jVar = this.f5248c;
        if (jVar == null) {
            return false;
        }
        try {
            jVar.a((Context) b.Q(aVar));
            return true;
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final boolean H(a aVar) {
        o oVar = this.d;
        if (oVar == null) {
            return false;
        }
        try {
            oVar.a((Context) b.Q(aVar));
            return true;
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(a aVar, String str, Bundle bundle, Bundle bundle2, um2 um2, rc rcVar) {
        com.google.android.gms.ads.a aVar2;
        try {
            ad adVar = new ad(this, rcVar);
            RtbAdapter rtbAdapter = this.f5247b;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                aVar2 = com.google.android.gms.ads.a.BANNER;
            } else if (c2 == 1) {
                aVar2 = com.google.android.gms.ads.a.INTERSTITIAL;
            } else if (c2 == 2) {
                aVar2 = com.google.android.gms.ads.a.REWARDED;
            } else if (c2 == 3) {
                aVar2 = com.google.android.gms.ads.a.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            i iVar = new i(aVar2, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(iVar);
            rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.a((Context) b.Q(aVar), arrayList, bundle, a0.a(um2.f, um2.f4977c, um2.f4976b)), adVar);
        } catch (Throwable th) {
            co.b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, ec ecVar, xa xaVar, um2 um2) {
        try {
            this.f5247b.loadBannerAd(new g((Context) b.Q(aVar), str, A(str2), d(rm2), c(rm2), rm2.l, rm2.h, rm2.u, a(str2, rm2), a0.a(um2.f, um2.f4977c, um2.f4976b), this.e), new zc(this, ecVar, xaVar));
        } catch (Throwable th) {
            co.b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, fc fcVar, xa xaVar) {
        try {
            this.f5247b.loadInterstitialAd(new k((Context) b.Q(aVar), str, A(str2), d(rm2), c(rm2), rm2.l, rm2.h, rm2.u, a(str2, rm2), this.e), new yc(this, fcVar, xaVar));
        } catch (Throwable th) {
            co.b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, kc kcVar, xa xaVar) {
        try {
            this.f5247b.loadNativeAd(new m((Context) b.Q(aVar), str, A(str2), d(rm2), c(rm2), rm2.l, rm2.h, rm2.u, a(str2, rm2), this.e), new bd(this, kcVar, xaVar));
        } catch (Throwable th) {
            co.b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, lc lcVar, xa xaVar) {
        try {
            this.f5247b.loadRewardedAd(new p((Context) b.Q(aVar), str, A(str2), d(rm2), c(rm2), rm2.l, rm2.h, rm2.u, a(str2, rm2), this.e), a(lcVar, xaVar));
        } catch (Throwable th) {
            co.b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final ed a0() {
        ed.a(this.f5247b.getSDKVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void b(String str, String str2, rm2 rm2, a aVar, lc lcVar, xa xaVar) {
        try {
            this.f5247b.zza(new p((Context) b.Q(aVar), str, A(str2), d(rm2), c(rm2), rm2.l, rm2.h, rm2.u, a(str2, rm2), this.e), a(lcVar, xaVar));
        } catch (Throwable th) {
            co.b("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final rp2 getVideoController() {
        RtbAdapter rtbAdapter = this.f5247b;
        if (!(rtbAdapter instanceof y)) {
            return null;
        }
        try {
            return ((y) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final ed h0() {
        ed.a(this.f5247b.getVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void r(String str) {
        this.e = str;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void y(a aVar) {
    }
}
