package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class dp2 extends h72 implements cp2 {
    dp2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.cp2
    public final String B1() {
        Parcel a2 = a(2, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.cp2
    public final String U0() {
        Parcel a2 = a(1, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
