package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class hc extends h72 implements fc {
    hc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.fc
    public final void S() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.fc
    public final void a(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(3, r0);
    }
}
