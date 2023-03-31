package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class xg extends j72 implements ug {
    public xg() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String m = m();
            parcel2.writeNoException();
            parcel2.writeString(m);
        } else if (i != 2) {
            return false;
        } else {
            int I = I();
            parcel2.writeNoException();
            parcel2.writeInt(I);
        }
        return true;
    }
}
