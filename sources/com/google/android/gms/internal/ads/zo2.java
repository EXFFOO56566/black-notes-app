package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class zo2 extends h72 implements wo2 {
    zo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final IBinder e(a aVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeInt(i);
        Parcel a2 = a(1, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
