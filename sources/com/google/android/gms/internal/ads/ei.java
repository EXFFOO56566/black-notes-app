package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class ei extends h72 implements di {
    ei(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void F0() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void g(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(2, r0);
    }
}
