package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.d;
import com.google.android.gms.ads.mediation.customevent.c;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.co;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<c, d>, MediationInterstitialAdapter<c, d> {

    /* renamed from: a  reason: collision with root package name */
    private View f1368a;

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f1369b;

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f1370c;

    /* access modifiers changed from: package-private */
    public static final class a implements b {
        public a(CustomEventAdapter customEventAdapter, com.google.ads.mediation.c cVar) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements c {
        public b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, d dVar) {
        }
    }

    private static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            co.d(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.b
    public final void destroy() {
        CustomEventBanner customEventBanner = this.f1369b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f1370c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.b
    public final Class<c> getAdditionalParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f1368a;
    }

    @Override // com.google.ads.mediation.b
    public final Class<d> getServerParametersType() {
        return d.class;
    }

    public final void requestBannerAd(com.google.ads.mediation.c cVar, Activity activity, d dVar, b.c.a.c cVar2, com.google.ads.mediation.a aVar, c cVar3) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(dVar.f1372b);
        this.f1369b = customEventBanner;
        if (customEventBanner == null) {
            cVar.a(this, b.c.a.a.INTERNAL_ERROR);
        } else {
            this.f1369b.requestBannerAd(new a(this, cVar), activity, dVar.f1371a, dVar.f1373c, cVar2, aVar, cVar3 == null ? null : cVar3.a(dVar.f1371a));
        }
    }

    public final void requestInterstitialAd(d dVar, Activity activity, d dVar2, com.google.ads.mediation.a aVar, c cVar) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(dVar2.f1372b);
        this.f1370c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.a(this, b.c.a.a.INTERNAL_ERROR);
        } else {
            this.f1370c.requestInterstitialAd(new b(this, this, dVar), activity, dVar2.f1371a, dVar2.f1373c, aVar, cVar == null ? null : cVar.a(dVar2.f1371a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f1370c.showInterstitial();
    }
}
