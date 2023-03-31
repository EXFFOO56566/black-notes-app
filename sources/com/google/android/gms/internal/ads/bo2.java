package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class bo2 extends h72 implements co2 {
    bo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.ads.co2
    public final IBinder a(a aVar, String str, ra raVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeString(str);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(1, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
