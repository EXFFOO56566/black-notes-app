package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class xj1 extends h72 implements yj1 {
    xj1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.yj1
    public final hk1 a(fk1 fk1) {
        Parcel r0 = r0();
        i72.a(r0, fk1);
        Parcel a2 = a(3, r0);
        hk1 hk1 = (hk1) i72.a(a2, hk1.CREATOR);
        a2.recycle();
        return hk1;
    }

    @Override // com.google.android.gms.internal.ads.yj1
    public final wj1 a(uj1 uj1) {
        Parcel r0 = r0();
        i72.a(r0, uj1);
        Parcel a2 = a(1, r0);
        wj1 wj1 = (wj1) i72.a(a2, wj1.CREATOR);
        a2.recycle();
        return wj1;
    }

    @Override // com.google.android.gms.internal.ads.yj1
    public final void a(pj1 pj1) {
        Parcel r0 = r0();
        i72.a(r0, pj1);
        b(2, r0);
    }
}
