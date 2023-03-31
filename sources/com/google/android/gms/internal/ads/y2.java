package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class y2 extends h72 implements w2 {
    y2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void a(k2 k2Var) {
        Parcel r0 = r0();
        i72.a(r0, k2Var);
        b(1, r0);
    }
}
