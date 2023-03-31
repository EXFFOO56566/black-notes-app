package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.q;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.p;
import com.google.android.gms.ads.s.i;
import com.google.android.gms.common.internal.r;

public final class pb implements h, l, n {

    /* renamed from: a  reason: collision with root package name */
    private final xa f4134a;

    /* renamed from: b  reason: collision with root package name */
    private q f4135b;

    /* renamed from: c  reason: collision with root package name */
    private w f4136c;
    private i d;

    public pb(xa xaVar) {
        this.f4134a = xaVar;
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter, w wVar, q qVar) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            p pVar = new p();
            pVar.a(new mb());
            if (wVar != null && wVar.r()) {
                wVar.a(pVar);
            }
            if (qVar != null && qVar.f()) {
                qVar.a(pVar);
            }
        }
    }

    public final q a() {
        return this.f4135b;
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void a(MediationBannerAdapter mediationBannerAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdClosed.");
        try {
            this.f4134a.x();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void a(MediationBannerAdapter mediationBannerAdapter, int i) {
        r.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        co.a(sb.toString());
        try {
            this.f4134a.a(i);
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void a(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAppEvent.");
        try {
            this.f4134a.a(str, str2);
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.l
    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLeftApplication.");
        try {
            this.f4134a.G();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.l
    public final void a(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        r.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        co.a(sb.toString());
        try {
            this.f4134a.a(i);
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void a(MediationNativeAdapter mediationNativeAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdOpened.");
        try {
            this.f4134a.B();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void a(MediationNativeAdapter mediationNativeAdapter, int i) {
        r.a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        co.a(sb.toString());
        try {
            this.f4134a.a(i);
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void a(MediationNativeAdapter mediationNativeAdapter, q qVar) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLoaded.");
        this.f4135b = qVar;
        this.f4136c = null;
        a(mediationNativeAdapter, (w) null, qVar);
        try {
            this.f4134a.s();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void a(MediationNativeAdapter mediationNativeAdapter, w wVar) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLoaded.");
        this.f4136c = wVar;
        this.f4135b = null;
        a(mediationNativeAdapter, wVar, (q) null);
        try {
            this.f4134a.s();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar) {
        r.a("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(iVar.Y());
        co.a(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.d = iVar;
        try {
            this.f4134a.s();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void a(MediationNativeAdapter mediationNativeAdapter, i iVar, String str) {
        if (iVar instanceof x2) {
            try {
                this.f4134a.a(((x2) iVar).a(), str);
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        } else {
            co.d("Unexpected native custom template ad type.");
        }
    }

    public final w b() {
        return this.f4136c;
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void b(MediationBannerAdapter mediationBannerAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdClicked.");
        try {
            this.f4134a.l();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.l
    public final void b(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLoaded.");
        try {
            this.f4134a.s();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void b(MediationNativeAdapter mediationNativeAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLeftApplication.");
        try {
            this.f4134a.G();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    public final i c() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void c(MediationBannerAdapter mediationBannerAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLoaded.");
        try {
            this.f4134a.s();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.l
    public final void c(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdClosed.");
        try {
            this.f4134a.x();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void c(MediationNativeAdapter mediationNativeAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdClosed.");
        try {
            this.f4134a.x();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void d(MediationBannerAdapter mediationBannerAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLeftApplication.");
        try {
            this.f4134a.G();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.l
    public final void d(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdClicked.");
        try {
            this.f4134a.l();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void d(MediationNativeAdapter mediationNativeAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        q qVar = this.f4135b;
        w wVar = this.f4136c;
        if (this.d == null) {
            if (qVar == null && wVar == null) {
                co.d("#007 Could not call remote method.", null);
                return;
            } else if (wVar != null && !wVar.l()) {
                co.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (qVar != null && !qVar.c()) {
                co.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        co.a("Adapter called onAdClicked.");
        try {
            this.f4134a.l();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void e(MediationBannerAdapter mediationBannerAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdOpened.");
        try {
            this.f4134a.B();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.l
    public final void e(MediationInterstitialAdapter mediationInterstitialAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdOpened.");
        try {
            this.f4134a.B();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.n
    public final void e(MediationNativeAdapter mediationNativeAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        q qVar = this.f4135b;
        w wVar = this.f4136c;
        if (this.d == null) {
            if (qVar == null && wVar == null) {
                co.d("#007 Could not call remote method.", null);
                return;
            } else if (wVar != null && !wVar.m()) {
                co.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (qVar != null && !qVar.d()) {
                co.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        co.a("Adapter called onAdImpression.");
        try {
            this.f4134a.K();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }
}
