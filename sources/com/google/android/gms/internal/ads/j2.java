package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class j2 extends h72 implements h2 {
    j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.h2
    public final void c(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.h2
    public final void e(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.h2
    public final void p1() {
        b(2, r0());
    }
}
