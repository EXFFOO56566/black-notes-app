package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class ci extends h72 implements bi {
    ci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void G0() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void a(wh whVar) {
        Parcel r0 = r0();
        i72.a(r0, whVar);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void b1() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final void j(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(4, r0);
    }
}
