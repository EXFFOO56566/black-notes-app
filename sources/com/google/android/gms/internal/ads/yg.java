package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class yg extends h72 implements zg {
    yg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.zg
    public final void a(ug ugVar, String str, String str2) {
        Parcel r0 = r0();
        i72.a(r0, ugVar);
        r0.writeString(str);
        r0.writeString(str2);
        b(2, r0);
    }
}
