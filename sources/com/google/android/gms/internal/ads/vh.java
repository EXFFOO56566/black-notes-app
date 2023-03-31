package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class vh extends j72 implements wh {
    public vh() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static wh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof wh ? (wh) queryLocalInterface : new yh(iBinder);
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
