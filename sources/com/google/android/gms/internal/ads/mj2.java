package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class mj2 extends h72 implements nj2 {
    mj2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final hj2 a(ij2 ij2) {
        Parcel r0 = r0();
        i72.a(r0, ij2);
        Parcel a2 = a(1, r0);
        hj2 hj2 = (hj2) i72.a(a2, hj2.CREATOR);
        a2.recycle();
        return hj2;
    }
}
