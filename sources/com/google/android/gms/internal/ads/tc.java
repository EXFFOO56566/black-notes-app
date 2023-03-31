package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class tc extends h72 implements rc {
    tc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final void b(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(2, r0);
    }

    @Override // com.google.android.gms.internal.ads.rc
    public final void e(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(1, r0);
    }
}
