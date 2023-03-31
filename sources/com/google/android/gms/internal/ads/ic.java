package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class ic extends j72 implements fc {
    public ic() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            S();
        } else if (i != 3) {
            return false;
        } else {
            a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
