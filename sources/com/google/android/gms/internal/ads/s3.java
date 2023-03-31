package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class s3 extends h72 implements q3 {
    s3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.q3
    public final void a(w3 w3Var) {
        Parcel r0 = r0();
        i72.a(r0, w3Var);
        b(1, r0);
    }
}
