package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class gc extends h72 implements ec {
    gc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.ec
    public final void J(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.ec
    public final void a(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(2, r0);
    }
}
