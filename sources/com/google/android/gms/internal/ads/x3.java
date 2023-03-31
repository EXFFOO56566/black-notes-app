package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class x3 extends h72 implements v3 {
    x3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.v3
    public final void U1() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.v3
    public final void j(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(1, r0);
    }
}
