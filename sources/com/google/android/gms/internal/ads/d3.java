package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class d3 extends h72 implements b3 {
    d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final void a(o2 o2Var) {
        Parcel r0 = r0();
        i72.a(r0, o2Var);
        b(1, r0);
    }
}
