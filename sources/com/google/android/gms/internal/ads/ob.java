package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.a0;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.mediation.p;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.u;
import com.google.android.gms.ads.mediation.v;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ob extends va {

    /* renamed from: b  reason: collision with root package name */
    private final Object f3972b;

    /* renamed from: c  reason: collision with root package name */
    private pb f3973c;
    private ph d;
    private a e;
    private o f;

    public ob(com.google.android.gms.ads.mediation.a aVar) {
        this.f3972b = aVar;
    }

    public ob(f fVar) {
        this.f3972b = fVar;
    }

    private final Bundle a(String str, rm2 rm2, String str2) {
        String valueOf = String.valueOf(str);
        co.a(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f3972b instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (rm2 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", rm2.h);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            throw new RemoteException();
        }
    }

    private final d<o, Object> a(xa xaVar) {
        return new qb(this, xaVar);
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
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f3972b.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle A1() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void F(a aVar) {
        if (this.f3972b instanceof com.google.android.gms.ads.mediation.a) {
            co.a("Show rewarded ad from adapter.");
            o oVar = this.f;
            if (oVar != null) {
                oVar.a((Context) b.Q(aVar));
            } else {
                co.b("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final a F1() {
        Object obj = this.f3972b;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return b.a(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final gb J0() {
        q a2 = this.f3973c.a();
        if (a2 instanceof s) {
            return new ub((s) a2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final hb P1() {
        w b2 = this.f3973c.b();
        if (b2 != null) {
            return new bc(b2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, g6 g6Var, List<o6> list) {
        com.google.android.gms.ads.a aVar2;
        if (this.f3972b instanceof com.google.android.gms.ads.mediation.a) {
            nb nbVar = new nb(this, g6Var);
            ArrayList arrayList = new ArrayList();
            for (o6 o6Var : list) {
                String str = o6Var.f3951b;
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
                    throw new RemoteException();
                }
                arrayList.add(new i(aVar2, o6Var.f3952c));
            }
            ((com.google.android.gms.ads.mediation.a) this.f3972b).initialize((Context) b.Q(aVar), nbVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, ph phVar, List<String> list) {
        if (this.f3972b instanceof InitializableMediationRewardedVideoAdAdapter) {
            co.a("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f3972b;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    arrayList.add(a(str, (rm2) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) b.Q(aVar), new qh(phVar), arrayList);
            } catch (Throwable th) {
                co.c("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, ph phVar, String str2) {
        Bundle bundle;
        lb lbVar;
        Object obj = this.f3972b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            co.a("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f3972b;
                Bundle a2 = a(str2, rm2, (String) null);
                if (rm2 != null) {
                    lb lbVar2 = new lb(rm2.f4521c == -1 ? null : new Date(rm2.f4521c), rm2.e, rm2.f != null ? new HashSet(rm2.f) : null, rm2.l, c(rm2), rm2.h, rm2.s, rm2.u, a(str2, rm2));
                    bundle = rm2.n != null ? rm2.n.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    lbVar = lbVar2;
                } else {
                    lbVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) b.Q(aVar), lbVar, str, new qh(phVar), a2, bundle);
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof com.google.android.gms.ads.mediation.a) {
            this.e = aVar;
            this.d = phVar;
            phVar.N(b.a(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
            String canonicalName3 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, xa xaVar) {
        if (this.f3972b instanceof com.google.android.gms.ads.mediation.a) {
            co.a("Requesting rewarded ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.a) this.f3972b).loadRewardedAd(new p((Context) b.Q(aVar), BuildConfig.FLAVOR, a(str, rm2, (String) null), d(rm2), c(rm2), rm2.l, rm2.h, rm2.u, a(str, rm2), BuildConfig.FLAVOR), a(xaVar));
            } catch (Exception e2) {
                co.b(BuildConfig.FLAVOR, e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, String str2, xa xaVar) {
        if (this.f3972b instanceof MediationInterstitialAdapter) {
            co.a("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f3972b;
                Bundle bundle = null;
                lb lbVar = new lb(rm2.f4521c == -1 ? null : new Date(rm2.f4521c), rm2.e, rm2.f != null ? new HashSet(rm2.f) : null, rm2.l, c(rm2), rm2.h, rm2.s, rm2.u, a(str, rm2));
                if (rm2.n != null) {
                    bundle = rm2.n.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) b.Q(aVar), new pb(xaVar), a(str, rm2, str2), lbVar, bundle);
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, String str2, xa xaVar, m1 m1Var, List<String> list) {
        Object obj = this.f3972b;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                Bundle bundle = null;
                tb tbVar = new tb(rm2.f4521c == -1 ? null : new Date(rm2.f4521c), rm2.e, rm2.f != null ? new HashSet(rm2.f) : null, rm2.l, c(rm2), rm2.h, m1Var, list, rm2.s, rm2.u, a(str, rm2));
                if (rm2.n != null) {
                    bundle = rm2.n.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f3973c = new pb(xaVar);
                mediationNativeAdapter.requestNativeAd((Context) b.Q(aVar), this.f3973c, a(str, rm2, str2), tbVar, bundle);
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, um2 um2, rm2 rm2, String str, xa xaVar) {
        a(aVar, um2, rm2, str, null, xaVar);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, um2 um2, rm2 rm2, String str, String str2, xa xaVar) {
        if (this.f3972b instanceof MediationBannerAdapter) {
            co.a("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f3972b;
                Bundle bundle = null;
                lb lbVar = new lb(rm2.f4521c == -1 ? null : new Date(rm2.f4521c), rm2.e, rm2.f != null ? new HashSet(rm2.f) : null, rm2.l, c(rm2), rm2.h, rm2.s, rm2.u, a(str, rm2));
                if (rm2.n != null) {
                    bundle = rm2.n.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) b.Q(aVar), new pb(xaVar), a(str, rm2, str2), um2.o ? a0.a(um2.f, um2.f4977c) : a0.a(um2.f, um2.f4977c, um2.f4976b), lbVar, bundle);
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(rm2 rm2, String str) {
        a(rm2, str, (String) null);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(rm2 rm2, String str, String str2) {
        Object obj = this.f3972b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            co.a("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f3972b;
                Bundle bundle = null;
                lb lbVar = new lb(rm2.f4521c == -1 ? null : new Date(rm2.f4521c), rm2.e, rm2.f != null ? new HashSet(rm2.f) : null, rm2.l, c(rm2), rm2.h, rm2.s, rm2.u, a(str, rm2));
                if (rm2.n != null) {
                    bundle = rm2.n.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(lbVar, a(str, rm2, str2), bundle);
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof com.google.android.gms.ads.mediation.a) {
            a(this.e, rm2, str, new sb((com.google.android.gms.ads.mediation.a) obj, this.d));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
            String canonicalName3 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(boolean z) {
        Object obj = this.f3972b;
        if (!(obj instanceof v)) {
            String canonicalName = v.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.a(sb.toString());
            return;
        }
        try {
            ((v) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ed a0() {
        Object obj = this.f3972b;
        if (!(obj instanceof com.google.android.gms.ads.mediation.a)) {
            return null;
        }
        ed.a(((com.google.android.gms.ads.mediation.a) obj).getSDKVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void b(a aVar, rm2 rm2, String str, xa xaVar) {
        a(aVar, rm2, str, (String) null, xaVar);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void c(a aVar, rm2 rm2, String str, xa xaVar) {
        if (this.f3972b instanceof com.google.android.gms.ads.mediation.a) {
            co.a("Requesting rewarded interstitial ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.a) this.f3972b).zza(new p((Context) b.Q(aVar), BuildConfig.FLAVOR, a(str, rm2, (String) null), d(rm2), c(rm2), rm2.l, rm2.h, rm2.u, a(str, rm2), BuildConfig.FLAVOR), a(xaVar));
            } catch (Exception e2) {
                co.b(BuildConfig.FLAVOR, e2);
                throw new RemoteException();
            }
        } else {
            String canonicalName = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void destroy() {
        Object obj = this.f3972b;
        if (obj instanceof f) {
            try {
                ((f) obj).onDestroy();
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final boolean f1() {
        return this.f3972b instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f3972b;
        if (obj instanceof zzbgz) {
            return ((zzbgz) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbgz.class.getCanonicalName();
        String canonicalName2 = this.f3972b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        co.d(sb.toString());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final rp2 getVideoController() {
        Object obj = this.f3972b;
        if (!(obj instanceof y)) {
            return null;
        }
        try {
            return ((y) obj).getVideoController();
        } catch (Throwable th) {
            co.b(BuildConfig.FLAVOR, th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void h(a aVar) {
        Context context = (Context) b.Q(aVar);
        Object obj = this.f3972b;
        if (obj instanceof u) {
            ((u) obj).a(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ed h0() {
        Object obj = this.f3972b;
        if (!(obj instanceof com.google.android.gms.ads.mediation.a)) {
            return null;
        }
        ed.a(((com.google.android.gms.ads.mediation.a) obj).getVersionInfo());
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final boolean isInitialized() {
        Object obj = this.f3972b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            co.a("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f3972b).isInitialized();
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof com.google.android.gms.ads.mediation.a) {
            return this.d != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
            String canonicalName3 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ab n1() {
        q a2 = this.f3973c.a();
        if (a2 instanceof r) {
            return new rb((r) a2);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void p() {
        Object obj = this.f3972b;
        if (obj instanceof f) {
            try {
                ((f) obj).onPause();
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void showInterstitial() {
        if (this.f3972b instanceof MediationInterstitialAdapter) {
            co.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f3972b).showInterstitial();
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void showVideo() {
        Object obj = this.f3972b;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            co.a("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f3972b).showVideo();
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        } else if (obj instanceof com.google.android.gms.ads.mediation.a) {
            o oVar = this.f;
            if (oVar != null) {
                oVar.a((Context) b.Q(this.e));
            } else {
                co.b("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
            String canonicalName3 = this.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            co.d(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void z() {
        Object obj = this.f3972b;
        if (obj instanceof f) {
            try {
                ((f) obj).onResume();
            } catch (Throwable th) {
                co.b(BuildConfig.FLAVOR, th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final s2 z0() {
        com.google.android.gms.ads.s.i c2 = this.f3973c.c();
        if (c2 instanceof x2) {
            return ((x2) c2).a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle zzti() {
        Object obj = this.f3972b;
        if (obj instanceof zzbgx) {
            return ((zzbgx) obj).zzti();
        }
        String canonicalName = zzbgx.class.getCanonicalName();
        String canonicalName2 = this.f3972b.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        co.d(sb.toString());
        return new Bundle();
    }
}
