package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.a.c;
import b.c.b.a.d.a;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.b;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class wb<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> extends va {

    /* renamed from: b  reason: collision with root package name */
    private final b<NETWORK_EXTRAS, SERVER_PARAMETERS> f5238b;

    /* renamed from: c  reason: collision with root package name */
    private final NETWORK_EXTRAS f5239c;

    public wb(b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f5238b = bVar;
        this.f5239c = network_extras;
    }

    private final SERVER_PARAMETERS A(String str) {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f5238b.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
        newInstance.a(hashMap);
        return newInstance;
    }

    private static boolean c(rm2 rm2) {
        if (rm2.g) {
            return true;
        }
        on2.a();
        return sn.a();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle A1() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void F(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final a F1() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5238b;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            co.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return b.c.b.a.d.b.a(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final gb J0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final hb P1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, g6 g6Var, List<o6> list) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, ph phVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, ph phVar, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, xa xaVar) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, String str2, xa xaVar) {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5238b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            co.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        co.a("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5238b).requestInterstitialAd(new vb(xaVar), (Activity) b.c.b.a.d.b.Q(aVar), A(str), ac.a(rm2, c(rm2)), this.f5239c);
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, String str2, xa xaVar, m1 m1Var, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, um2 um2, rm2 rm2, String str, xa xaVar) {
        a(aVar, um2, rm2, str, null, xaVar);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, um2 um2, rm2 rm2, String str, String str2, xa xaVar) {
        c cVar;
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5238b;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            co.d(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        co.a("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f5238b;
            vb vbVar = new vb(xaVar);
            Activity activity = (Activity) b.c.b.a.d.b.Q(aVar);
            SERVER_PARAMETERS A = A(str);
            int i = 0;
            c[] cVarArr = {c.f1138b, c.f1139c, c.d, c.e, c.f, c.g};
            while (true) {
                if (i < 6) {
                    if (cVarArr[i].b() == um2.f && cVarArr[i].a() == um2.f4977c) {
                        cVar = cVarArr[i];
                        break;
                    }
                    i++;
                } else {
                    cVar = new c(a0.a(um2.f, um2.f4977c, um2.f4976b));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(vbVar, activity, A, cVar, ac.a(rm2, c(rm2)), this.f5239c);
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(rm2 rm2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(rm2 rm2, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ed a0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void b(a aVar, rm2 rm2, String str, xa xaVar) {
        a(aVar, rm2, str, (String) null, xaVar);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void c(a aVar, rm2 rm2, String str, xa xaVar) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void destroy() {
        try {
            this.f5238b.destroy();
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final boolean f1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final rp2 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void h(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ed h0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ab n1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void p() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void showInterstitial() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f5238b;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            co.d(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        co.a("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f5238b).showInterstitial();
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void z() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final s2 z0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle zzti() {
        return new Bundle();
    }
}
