package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class z6 extends h72 implements x6 {
    z6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void a(s6 s6Var) {
        Parcel r0 = r0();
        i72.a(r0, s6Var);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void i(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(2, r0);
    }
}
