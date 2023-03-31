package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class n3 extends h72 implements l3 {
    n3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.l3
    public final void a(eo2 eo2, a aVar) {
        Parcel r0 = r0();
        i72.a(r0, eo2);
        i72.a(r0, aVar);
        b(1, r0);
    }
}
