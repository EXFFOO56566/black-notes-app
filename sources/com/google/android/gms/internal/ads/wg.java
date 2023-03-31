package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class wg extends h72 implements ug {
    wg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final int I() {
        Parcel a2 = a(2, r0());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.ug
    public final String m() {
        Parcel a2 = a(1, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
