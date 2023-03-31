package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class fh extends h72 implements ch {
    fh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final IBinder a(a aVar, ra raVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(1, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
