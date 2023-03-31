package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.i;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.v;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.s.g;
import com.google.android.gms.ads.s.h;
import com.google.android.gms.ads.s.i;
import com.google.android.gms.ads.s.k;
import com.google.android.gms.ads.s.l;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.jm2;
import com.google.android.gms.internal.ads.on2;
import com.google.android.gms.internal.ads.rp2;
import com.google.android.gms.internal.ads.sn;
import com.google.android.gms.internal.ads.zzbgz;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, v, y, MediationRewardedVideoAdAdapter, zzbgz {
    public static final String AD_UNIT_ID_PARAMETER;
    private AdView zzlw;
    private i zzlx;
    private com.google.android.gms.ads.c zzly;
    private Context zzlz;
    private i zzma;
    private com.google.android.gms.ads.reward.mediation.a zzmb;
    private final com.google.android.gms.ads.x.d zzmc = new h(this);

    static class a extends s {
        private final h n;

        public a(h hVar) {
            this.n = hVar;
            d(hVar.e().toString());
            a(hVar.f());
            b(hVar.c().toString());
            if (hVar.g() != null) {
                a(hVar.g());
            }
            c(hVar.d().toString());
            a(hVar.b().toString());
            b(true);
            a(true);
            a(hVar.h());
        }

        @Override // com.google.android.gms.ads.mediation.q
        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.s.e) {
                ((com.google.android.gms.ads.s.e) view).setNativeAd(this.n);
            }
            com.google.android.gms.ads.s.f fVar = com.google.android.gms.ads.s.f.f1472c.get(view);
            if (fVar != null) {
                fVar.a(this.n);
            }
        }
    }

    static class b extends r {
        private final g p;

        public b(g gVar) {
            this.p = gVar;
            c(gVar.d().toString());
            a(gVar.f());
            a(gVar.b().toString());
            a(gVar.e());
            b(gVar.c().toString());
            if (gVar.h() != null) {
                a(gVar.h().doubleValue());
            }
            if (gVar.i() != null) {
                e(gVar.i().toString());
            }
            if (gVar.g() != null) {
                d(gVar.g().toString());
            }
            b(true);
            a(true);
            a(gVar.j());
        }

        @Override // com.google.android.gms.ads.mediation.q
        public final void b(View view) {
            if (view instanceof com.google.android.gms.ads.s.e) {
                ((com.google.android.gms.ads.s.e) view).setNativeAd(this.p);
            }
            com.google.android.gms.ads.s.f fVar = com.google.android.gms.ads.s.f.f1472c.get(view);
            if (fVar != null) {
                fVar.a(this.p);
            }
        }
    }

    static final class c extends com.google.android.gms.ads.b implements com.google.android.gms.ads.r.a, jm2 {

        /* renamed from: b */
        private final AbstractAdViewAdapter f1362b;

        /* renamed from: c */
        private final com.google.android.gms.ads.mediation.h f1363c;

        public c(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.h hVar) {
            this.f1362b = abstractAdViewAdapter;
            this.f1363c = hVar;
        }

        @Override // com.google.android.gms.ads.b
        public final void a() {
            this.f1363c.a(this.f1362b);
        }

        @Override // com.google.android.gms.ads.b
        public final void a(int i) {
            this.f1363c.a(this.f1362b, i);
        }

        @Override // com.google.android.gms.ads.r.a
        public final void a(String str, String str2) {
            this.f1363c.a(this.f1362b, str, str2);
        }

        @Override // com.google.android.gms.ads.b
        public final void c() {
            this.f1363c.d(this.f1362b);
        }

        @Override // com.google.android.gms.ads.b
        public final void d() {
            this.f1363c.c(this.f1362b);
        }

        @Override // com.google.android.gms.ads.b
        public final void e() {
            this.f1363c.e(this.f1362b);
        }

        @Override // com.google.android.gms.internal.ads.jm2, com.google.android.gms.ads.b
        public final void l() {
            this.f1363c.b(this.f1362b);
        }
    }

    static class d extends w {
        private final k s;

        public d(k kVar) {
            this.s = kVar;
            d(kVar.d());
            a(kVar.f());
            b(kVar.b());
            a(kVar.e());
            c(kVar.c());
            a(kVar.a());
            a(kVar.h());
            f(kVar.i());
            e(kVar.g());
            a(kVar.l());
            b(true);
            a(true);
            a(kVar.j());
        }

        @Override // com.google.android.gms.ads.mediation.w
        public final void a(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof l) {
                ((l) view).setNativeAd(this.s);
                return;
            }
            com.google.android.gms.ads.s.f fVar = com.google.android.gms.ads.s.f.f1472c.get(view);
            if (fVar != null) {
                fVar.a(this.s);
            }
        }
    }

    static final class e extends com.google.android.gms.ads.b implements g.a, h.a, i.a, i.b, k.a {

        /* renamed from: b */
        private final AbstractAdViewAdapter f1364b;

        /* renamed from: c */
        private final n f1365c;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
            this.f1364b = abstractAdViewAdapter;
            this.f1365c = nVar;
        }

        @Override // com.google.android.gms.ads.b
        public final void a() {
            this.f1365c.c(this.f1364b);
        }

        @Override // com.google.android.gms.ads.b
        public final void a(int i) {
            this.f1365c.a(this.f1364b, i);
        }

        @Override // com.google.android.gms.ads.s.g.a
        public final void a(g gVar) {
            this.f1365c.a(this.f1364b, new b(gVar));
        }

        @Override // com.google.android.gms.ads.s.h.a
        public final void a(h hVar) {
            this.f1365c.a(this.f1364b, new a(hVar));
        }

        @Override // com.google.android.gms.ads.s.i.b
        public final void a(com.google.android.gms.ads.s.i iVar) {
            this.f1365c.a(this.f1364b, iVar);
        }

        @Override // com.google.android.gms.ads.s.i.a
        public final void a(com.google.android.gms.ads.s.i iVar, String str) {
            this.f1365c.a(this.f1364b, iVar, str);
        }

        @Override // com.google.android.gms.ads.s.k.a
        public final void a(k kVar) {
            this.f1365c.a(this.f1364b, new d(kVar));
        }

        @Override // com.google.android.gms.ads.b
        public final void b() {
            this.f1365c.e(this.f1364b);
        }

        @Override // com.google.android.gms.ads.b
        public final void c() {
            this.f1365c.b(this.f1364b);
        }

        @Override // com.google.android.gms.ads.b
        public final void d() {
        }

        @Override // com.google.android.gms.ads.b
        public final void e() {
            this.f1365c.a(this.f1364b);
        }

        @Override // com.google.android.gms.ads.b
        public final void l() {
            this.f1365c.d(this.f1364b);
        }
    }

    static final class f extends com.google.android.gms.ads.b implements jm2 {

        /* renamed from: b */
        private final AbstractAdViewAdapter f1366b;

        /* renamed from: c */
        private final com.google.android.gms.ads.mediation.l f1367c;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.l lVar) {
            this.f1366b = abstractAdViewAdapter;
            this.f1367c = lVar;
        }

        @Override // com.google.android.gms.ads.b
        public final void a() {
            this.f1367c.c(this.f1366b);
        }

        @Override // com.google.android.gms.ads.b
        public final void a(int i) {
            this.f1367c.a(this.f1366b, i);
        }

        @Override // com.google.android.gms.ads.b
        public final void c() {
            this.f1367c.a(this.f1366b);
        }

        @Override // com.google.android.gms.ads.b
        public final void d() {
            this.f1367c.b(this.f1366b);
        }

        @Override // com.google.android.gms.ads.b
        public final void e() {
            this.f1367c.e(this.f1366b);
        }

        @Override // com.google.android.gms.internal.ads.jm2, com.google.android.gms.ads.b
        public final void l() {
            this.f1367c.d(this.f1366b);
        }
    }

    private final com.google.android.gms.ads.d zza(Context context, com.google.android.gms.ads.mediation.e eVar, Bundle bundle, Bundle bundle2) {
        d.a aVar = new d.a();
        Date c2 = eVar.c();
        if (c2 != null) {
            aVar.a(c2);
        }
        int m = eVar.m();
        if (m != 0) {
            aVar.a(m);
        }
        Set<String> e2 = eVar.e();
        if (e2 != null) {
            for (String str : e2) {
                aVar.a(str);
            }
        }
        Location k = eVar.k();
        if (k != null) {
            aVar.a(k);
        }
        if (eVar.d()) {
            on2.a();
            aVar.b(sn.a(context));
        }
        if (eVar.h() != -1) {
            boolean z = true;
            if (eVar.h() != 1) {
                z = false;
            }
            aVar.b(z);
        }
        aVar.a(eVar.a());
        aVar.a(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar.a();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzlw;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public Bundle getInterstitialAdapterInfo() {
        f.a aVar = new f.a();
        aVar.a(1);
        return aVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.y
    public rp2 getVideoController() {
        p videoController;
        AdView adView = this.zzlw;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.a();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.e eVar, String str, com.google.android.gms.ads.reward.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        this.zzlz = context.getApplicationContext();
        this.zzmb = aVar;
        aVar.c(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzmb != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.e eVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzlz;
        if (context == null || this.zzmb == null) {
            co.b("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        com.google.android.gms.ads.i iVar = new com.google.android.gms.ads.i(context);
        this.zzma = iVar;
        iVar.b(true);
        this.zzma.a(getAdUnitId(bundle));
        this.zzma.a(this.zzmc);
        this.zzma.a(new g(this));
        this.zzma.a(zza(this.zzlz, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.f
    public void onDestroy() {
        AdView adView = this.zzlw;
        if (adView != null) {
            adView.a();
            this.zzlw = null;
        }
        if (this.zzlx != null) {
            this.zzlx = null;
        }
        if (this.zzly != null) {
            this.zzly = null;
        }
        if (this.zzma != null) {
            this.zzma = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.v
    public void onImmersiveModeUpdated(boolean z) {
        com.google.android.gms.ads.i iVar = this.zzlx;
        if (iVar != null) {
            iVar.a(z);
        }
        com.google.android.gms.ads.i iVar2 = this.zzma;
        if (iVar2 != null) {
            iVar2.a(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public void onPause() {
        AdView adView = this.zzlw;
        if (adView != null) {
            adView.b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public void onResume() {
        AdView adView = this.zzlw;
        if (adView != null) {
            adView.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.h hVar, Bundle bundle, com.google.android.gms.ads.e eVar, com.google.android.gms.ads.mediation.e eVar2, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzlw = adView;
        adView.setAdSize(new com.google.android.gms.ads.e(eVar.b(), eVar.a()));
        this.zzlw.setAdUnitId(getAdUnitId(bundle));
        this.zzlw.setAdListener(new c(this, hVar));
        this.zzlw.a(zza(context, eVar2, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.l lVar, Bundle bundle, com.google.android.gms.ads.mediation.e eVar, Bundle bundle2) {
        com.google.android.gms.ads.i iVar = new com.google.android.gms.ads.i(context);
        this.zzlx = iVar;
        iVar.a(getAdUnitId(bundle));
        this.zzlx.a(new f(this, lVar));
        this.zzlx.a(zza(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, n nVar, Bundle bundle, t tVar, Bundle bundle2) {
        e eVar = new e(this, nVar);
        c.a aVar = new c.a(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVar.a((com.google.android.gms.ads.b) eVar);
        com.google.android.gms.ads.s.d g = tVar.g();
        if (g != null) {
            aVar.a(g);
        }
        if (tVar.i()) {
            aVar.a((k.a) eVar);
        }
        if (tVar.b()) {
            aVar.a((g.a) eVar);
        }
        if (tVar.l()) {
            aVar.a((h.a) eVar);
        }
        if (tVar.j()) {
            for (String str : tVar.f().keySet()) {
                aVar.a(str, eVar, tVar.f().get(str).booleanValue() ? eVar : null);
            }
        }
        com.google.android.gms.ads.c a2 = aVar.a();
        this.zzly = a2;
        a2.a(zza(context, tVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzlx.c();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzma.c();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
