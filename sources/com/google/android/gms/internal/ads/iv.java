package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class iv extends h72 implements gv {
    iv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.gv
    public final void a(a aVar, ev evVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, evVar);
        b(2, r0);
    }
}
