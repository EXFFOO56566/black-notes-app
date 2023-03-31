package com.google.android.gms.ads.mediation;

import android.content.Context;
import java.util.List;

public abstract class a {
    public abstract x getSDKVersionInfo();

    public abstract x getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<i> list);

    public void loadBannerAd(g gVar, d<Object, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support banner ads."));
    }

    public void loadInterstitialAd(k kVar, d<j, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support interstitial ads."));
    }

    public void loadNativeAd(m mVar, d<w, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support native ads."));
    }

    public void loadRewardedAd(p pVar, d<o, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded ads."));
    }

    public final void zza(p pVar, d<o, Object> dVar) {
        dVar.b(String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded interstitial ads."));
    }
}
