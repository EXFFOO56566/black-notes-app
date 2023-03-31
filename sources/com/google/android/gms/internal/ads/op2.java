package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class op2 extends h72 implements mp2 {
    op2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.internal.ads.mp2
    public final String Z0() {
        Parcel a2 = a(2, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.mp2
    public final String a() {
        Parcel a2 = a(1, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
