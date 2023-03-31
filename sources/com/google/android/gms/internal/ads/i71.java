package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.q;

public final class i71 implements y61<f71> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f3040a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f3041b;

    public i71(ko1 ko1, Context context) {
        this.f3040a = ko1;
        this.f3041b = context;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<f71> a() {
        return this.f3040a.a(new h71(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ f71 b() {
        int i;
        boolean z;
        int i2;
        int i3;
        TelephonyManager telephonyManager = (TelephonyManager) this.f3041b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int networkType = telephonyManager.getNetworkType();
        int phoneType = telephonyManager.getPhoneType();
        q.c();
        int i4 = -1;
        if (gl.b(this.f3041b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f3041b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                i4 = activeNetworkInfo.getType();
                i3 = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                i3 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
            i2 = i4;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        return new f71(networkOperator, i2, networkType, phoneType, z, i);
    }
}
