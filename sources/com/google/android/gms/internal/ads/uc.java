package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class uc extends j72 implements rc {
    public uc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            e(parcel.readString());
        } else if (i != 2) {
            return false;
        } else {
            b(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
