package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class v6 extends j72 implements w6 {
    public v6() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            W0();
        } else if (i != 2) {
            return false;
        } else {
            e(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
