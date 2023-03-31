package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.q;

@TargetApi(26)
public class tl extends ul {
    @Override // com.google.android.gms.internal.ads.ll
    public final wl2 a(Context context, TelephonyManager telephonyManager) {
        q.c();
        return gl.b(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? wl2.ENUM_TRUE : wl2.ENUM_FALSE : wl2.ENUM_FALSE;
    }
}
