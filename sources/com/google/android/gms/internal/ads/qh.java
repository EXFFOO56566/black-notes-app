package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.d.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.a;
import com.google.android.gms.common.internal.r;

public final class qh implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ph f4330a;

    public qh(ph phVar) {
        this.f4330a = phVar;
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onVideoCompleted.");
        try {
            this.f4330a.z(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdFailedToLoad.");
        try {
            this.f4330a.c(b.a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, com.google.android.gms.ads.x.b bVar) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onRewarded.");
        if (bVar != null) {
            try {
                this.f4330a.a(b.a(mediationRewardedVideoAdAdapter), new uh(bVar));
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        } else {
            this.f4330a.a(b.a(mediationRewardedVideoAdAdapter), new uh(BuildConfig.FLAVOR, 1));
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLeftApplication.");
        try {
            this.f4330a.q(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void c(Bundle bundle) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdMetadataChanged.");
        try {
            this.f4330a.c(bundle);
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onInitializationSucceeded.");
        try {
            this.f4330a.N(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdOpened.");
        try {
            this.f4330a.s(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onVideoStarted.");
        try {
            this.f4330a.C(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdLoaded.");
        try {
            this.f4330a.k(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.a
    public final void g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        r.a("#008 Must be called on the main UI thread.");
        co.a("Adapter called onAdClosed.");
        try {
            this.f4330a.K(b.a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }
}
