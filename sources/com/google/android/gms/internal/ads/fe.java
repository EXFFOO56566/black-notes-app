package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class fe extends h72 implements ce {
    fe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.ce
    public final IBinder E(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(1, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
