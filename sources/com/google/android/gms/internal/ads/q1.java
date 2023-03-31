package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public final class q1 extends h72 implements o1 {
    q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final String D0() {
        Parcel a2 = a(2, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.o1
    public final List<v1> q0() {
        Parcel a2 = a(3, r0());
        ArrayList b2 = i72.b(a2);
        a2.recycle();
        return b2;
    }
}
