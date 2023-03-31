package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.f;

public interface MediationRewardedVideoAdAdapter extends f {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, e eVar, String str, a aVar, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(e eVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}
