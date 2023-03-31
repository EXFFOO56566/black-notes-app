package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class jo2 extends h72 implements go2 {
    jo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.go2
    public final IBinder a(a aVar, um2 um2, String str, ra raVar, int i, int i2) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, um2);
        r0.writeString(str);
        i72.a(r0, raVar);
        r0.writeInt(i);
        r0.writeInt(i2);
        Parcel a2 = a(2, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
