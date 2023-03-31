package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.a.a;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.e;
import com.google.ads.mediation.f;

public final class vb<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> implements c, d {

    /* renamed from: a  reason: collision with root package name */
    private final xa f5080a;

    public vb(xa xaVar) {
        this.f5080a = xaVar;
    }

    @Override // com.google.ads.mediation.c
    public final void a(MediationBannerAdapter<?, ?> mediationBannerAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        co.a(sb.toString());
        on2.a();
        if (!sn.b()) {
            co.d("#008 Must be called on the main UI thread.", null);
            sn.f4682b.post(new xb(this, aVar));
            return;
        }
        try {
            this.f5080a.a(ac.a(aVar));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.ads.mediation.d
    public final void a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        co.a(sb.toString());
        on2.a();
        if (!sn.b()) {
            co.d("#008 Must be called on the main UI thread.", null);
            sn.f4682b.post(new zb(this, aVar));
            return;
        }
        try {
            this.f5080a.a(ac.a(aVar));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }
}
