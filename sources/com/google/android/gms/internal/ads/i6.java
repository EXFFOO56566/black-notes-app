package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class i6 extends h72 implements g6 {
    i6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.g6
    public final void U() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.g6
    public final void m(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(3, r0);
    }
}
