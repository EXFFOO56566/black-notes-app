package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.h;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.n;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.co;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: a  reason: collision with root package name */
    private View f1438a;

    /* renamed from: b  reason: collision with root package name */
    private CustomEventBanner f1439b;

    /* renamed from: c  reason: collision with root package name */
    private CustomEventInterstitial f1440c;
    private CustomEventNative d;

    static final class a implements b {
        public a(CustomEventAdapter customEventAdapter, h hVar) {
        }
    }

    static class b implements e {
        public b(CustomEventAdapter customEventAdapter, n nVar) {
        }
    }

    class c implements d {
        public c(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, l lVar) {
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

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final View getBannerView() {
        return this.f1438a;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.f1439b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f1440c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onPause() {
        CustomEventBanner customEventBanner = this.f1439b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f1440c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final void onResume() {
        CustomEventBanner customEventBanner = this.f1439b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f1440c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public final void requestBannerAd(Context context, h hVar, Bundle bundle, e eVar, com.google.android.gms.ads.mediation.e eVar2, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(bundle.getString("class_name"));
        this.f1439b = customEventBanner;
        if (customEventBanner == null) {
            hVar.a(this, 0);
        } else {
            this.f1439b.requestBannerAd(context, new a(this, hVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), eVar, eVar2, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, l lVar, Bundle bundle, com.google.android.gms.ads.mediation.e eVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(bundle.getString("class_name"));
        this.f1440c = customEventInterstitial;
        if (customEventInterstitial == null) {
            lVar.a(this, 0);
        } else {
            this.f1440c.requestInterstitialAd(context, new c(this, this, lVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), eVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void requestNativeAd(Context context, n nVar, Bundle bundle, t tVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(bundle.getString("class_name"));
        this.d = customEventNative;
        if (customEventNative == null) {
            nVar.a(this, 0);
        } else {
            this.d.requestNativeAd(context, new b(this, nVar), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), tVar, bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name")));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        this.f1440c.showInterstitial();
    }
}
