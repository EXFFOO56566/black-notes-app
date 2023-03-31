package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class t3 extends h72 implements r3 {
    t3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.r3
    public final boolean A(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(2, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }
}
