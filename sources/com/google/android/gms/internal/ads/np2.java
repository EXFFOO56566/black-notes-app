package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class np2 extends h72 implements lp2 {
    np2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.lp2
    public final void a(wm2 wm2) {
        Parcel r0 = r0();
        i72.a(r0, wm2);
        b(1, r0);
    }
}
