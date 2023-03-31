package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class y6 extends h72 implements w6 {
    y6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.w6
    public final void W0() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.w6
    public final void e(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(2, r0);
    }
}
