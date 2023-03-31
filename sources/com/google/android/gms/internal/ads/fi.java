package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class fi extends h72 implements gi {
    fi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.gi
    public final void a(wh whVar, String str, String str2) {
        Parcel r0 = r0();
        i72.a(r0, whVar);
        r0.writeString(str);
        r0.writeString(str2);
        b(2, r0);
    }
}
