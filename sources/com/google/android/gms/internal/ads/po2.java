package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class po2 extends h72 implements no2 {
    po2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.internal.ads.no2
    public final void a(String str, String str2) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        b(1, r0);
    }
}
