package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class mc extends h72 implements kc {
    mc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.kc
    public final void a(hb hbVar) {
        Parcel r0 = r0();
        i72.a(r0, hbVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.kc
    public final void a(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(2, r0);
    }
}
